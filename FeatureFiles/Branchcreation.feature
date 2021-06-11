Feature: Orange HRm
@tag1
Scenario: i want to validate login
Given i Enter url in chrome browser
When i enter username 
And i enter password
When i click on login button
Then i verify text in url
Then i close browser

@tag2
Scenario Outline: Validate Login withmultiple data
Given user launch url "<Browser>"
When user enter valid user"<Username>"
And user enter valid pass "<Password>"
When user click on login
Then user verify text in url
Then user close browser
Then i want to test
Examples:
|Browser|Username|Password|
|chrome|Admin|Qedge123!@#|
|firefox|Admin|qedge123!@#|
|chrome|Admin1|Qedge123!@#|
|chrome|Admin|qedge123!@#|
