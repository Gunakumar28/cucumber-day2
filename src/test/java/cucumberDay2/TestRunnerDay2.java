package cucumberDay2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\features2\\hotelbooking.feature"},glue= {"org.steps"},monochrome=true)
public class TestRunnerDay2 {

}
