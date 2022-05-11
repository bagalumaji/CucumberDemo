
#Login feature
  Feature: Login Feature
    Scenario: Login with valid credentials
      Given user landed on login page
      When user enters valid username and password
      And clicks on login button
      Then  user landed on user's home page
