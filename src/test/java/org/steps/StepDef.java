package org.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	WebDriver driver;

	@Given("user launch acadtin webpage")
	public void user_launch_acadtin_webpage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@When("user should enter valid {string}and{string}")
	public void user_should_enter_valid_and(String string, String string2) {
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}

	@When("user should click on login button")
	public void user_should_click_on_login_button() {
		WebElement findElement = driver.findElement(By.xpath("//*[@id='login']"));
		boolean enabled = findElement.isEnabled();
		Assert.assertTrue("Button enabled", enabled);
		findElement.click();
	}

	@When("user should enter valid credantials {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enter_valid_credantials(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8) {
		driver.findElement(By.xpath("//*[@id='location']")).sendKeys(string);
		driver.findElement(By.xpath("//*[@id='hotels']")).sendKeys(string2);
		driver.findElement(By.xpath("//*[@id='room_type']")).sendKeys(string3);
		driver.findElement(By.xpath("//*[@id='room_nos']")).sendKeys(string4);
		driver.findElement(By.xpath("//*[@id='datepick_in']")).sendKeys(string5);
		driver.findElement(By.xpath("//*[@id='datepick_out']")).sendKeys(string6);
		driver.findElement(By.xpath("//*[@id='adult_room']")).sendKeys(string7);
		driver.findElement(By.xpath("//*[@id='child_room']")).sendKeys(string8);
	}

	@When("user should click on searrch button")
	public void user_should_click_on_searrch_button() {
		 driver.findElement(By.xpath("//*[@id='Submit']")).submit();
	}

	@When("user should click on radio button")
	public void user_should_click_on_radio_button() {
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
	}

	@When("user should click on continue button")
	public void user_should_click_on_continue_button() {
		WebElement findElement = driver.findElement(By.xpath("//*[@id='continue']"));
		findElement.click();
	}

	@When("user should enter  credantials {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enter_credantials(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8) {
		driver.findElement(By.id("first_name")).sendKeys(string);
	    driver.findElement(By.id("last_name")).sendKeys(string2);
	    driver.findElement(By.xpath("//*[@id='address']")).sendKeys(string3);
		 driver.findElement(By.xpath("//*[@id='cc_num']")).sendKeys(string4);
	    driver.findElement(By.xpath("//*[@id='cc_type']")).sendKeys(string5);;
	    driver.findElement(By.xpath("//*[@id='cc_exp_month']")).sendKeys(string6);;
	    driver.findElement(By.xpath("//*[@id='cc_exp_year']")).sendKeys(string7);;
	    driver.findElement(By.xpath("//*[@id='cc_cvv']")).sendKeys(string8);
	}

	@When("user should click booknow button")
	public void user_should_click_booknow_button() {
		driver.findElement(By.xpath("//*[@id='book_now']")).click();
	}

	@Then("user verify the success message and get order number.")
	public void user_verify_the_success_message_and_get_order_number() throws InterruptedException {
		Thread.sleep(5000);
		 String attribute = driver.findElement(By.xpath("//*[@id='order_no']")).getAttribute("value");
		   System.out.println(attribute);
		   String currentUrl = driver.getCurrentUrl();
		   boolean l = currentUrl.contains("BookingConfirm");
		   Assert.assertTrue("verifiying sucess msg", l);
		   driver.quit();

	}

}