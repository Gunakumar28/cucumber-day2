Feature: verifing the adactin hotel booking page

  Scenario Outline: validation of login page and booking page using valid username and password
    Given user launch acadtin webpage
    When user should enter valid "<username>" "<password>"
    And user should click on login button
    And user should enter valid credantials "<Location>" "<Hotels>" "<Room Type>" "<Number of Rooms>" "<Check In Date>" "<Check Out Date>" "<Adults per Room>" "<Children per Room>"
    And user should click on searrch button
    And user should click on radio button
    And user should click on continue button
    And user should enter valid credantials "<First Name>" "<Last Name>" "<Billing Address>" "<Credit Card No.>" "<Credit Card Type>" "<Expiry Date>" "<CVV Number>"
    And user should click on booknow button
    Then user verify the success message and get order number.


Examples:
 |govindasrini|srini123|Sydney|Hotel Creek|Standard|1-One|26/02/2021|27/02/2021|1-One|1-One|ramesh|kannan|no.4 chennai|1234567897894561|VISA|May|2022|066|
 |govindasrini|srini123|Sydney|Hotel Creek|Standard|1-One|26/02/2021|27/02/2021|1-One|1-One|ramesh|kannan|no.2 china|1234567897894561|VISA|May|2022|555|   
 |govindasrini|srini123|Sydney|Hotel Creek|Standard|1-One|26/02/2021|27/02/2021|1-One|1-One|ramesh|kannan|no.8 goa|1234567897894561|VISA|May|2022|565| 
 |govindasrini|srini123|Sydney|Hotel Creek|Standard|1-One|26/02/2021|27/02/2021|1-One|1-One|ramesh|kannan|no.2 canada chennai|1234567897894561|VISA|May|2022|784|
 |govindasrini|srini123|Sydney|Hotel Creek|Standard|1-One|26/02/2021|27/02/2021|1-One|1-One|ramesh|kannan|no.2 chennai|1234567897894561|VISA|May|2022|456|
 |govindasrini|srini123|Sydney|Hotel Creek|Standard|1-One|26/02/2021|27/02/2021|1-One|1-One|ramesh|kannan|no.2 omr |1234567897894561|VISA|May|2022|547|
 |govindasrini|srini123|Sydney|Hotel Creek|Standard|1-One|26/02/2021|27/02/2021|1-One|1-One|ramesh|kannan|no.5kanchi|1234567897894561|VISA|May|2022|423|
 |govindasrini|srini123|Sydney|Hotel Creek|Standard|1-One|26/02/2021|27/02/2021|1-One|1-One|ramesh|kannan|no.sembakam|1234567897894561|VISA|May|2022|454|
 |govindasrini|srini123|Sydney|Hotel Creek|Standard|1-One|26/02/2021|27/02/2021|1-One|1-One |ramesh|kannan|no.hokencal|1234567897894561|VISA|May|2022|545|
 |govindasrini|srini123|
 |Sydney|Hotel Creek|Standard|1-One|26/02/2021|27/02/2021|1-One|1-One|
 |ramesh|kannan|no.8 kovai|1234567897894561|VISA|May|2022|022|
    