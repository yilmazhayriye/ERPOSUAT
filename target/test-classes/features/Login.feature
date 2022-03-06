@login
  Feature: LogIn


    Scenario: The User should be able to login erpos webpage
      Given User navigates to Login Page
      When User types valid "username" and "password"
      And User click to login button
