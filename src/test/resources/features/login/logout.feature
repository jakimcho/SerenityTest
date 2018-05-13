Feature: Logout

  In order to prevent others to use my account I want to have an option to log out.

  Background:
    Given I'm logged in my account

  Scenario: Successful Logout
    When I logout
    Then system destroy my sesison

