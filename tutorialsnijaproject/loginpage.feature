Feature:login functionality

Scenario: To verify login functionality by entering valid credentials

Given User has launcehd and browser and the application
When User enters valid Email
And User enters valid password
And User clicks on login button
Then User should be in dashboard page
