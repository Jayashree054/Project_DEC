Feature: Adactin Hotel booking
Scenario Outline: login functionality
Given User need  to launch the application
When User enter the username "<username>"in username field
And User enter Password "<password>" in password field
And User need to click on the login button
Then It will navigate to search hotel page


Examples:

|username|password|
|Ishu@234|Ishu@234|
|Ajay@234|Ajay@234|
|bony1234|bony@1234|
