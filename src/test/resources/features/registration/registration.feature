Feature: Light registration

  The potential users should be able to make a registration on the Jack casino website.

  Background:
    Given "Landing" page is opened
    And the "Login" form is opened


  @sanity-check
  Scenario: Successful registration on the site
    When The user enters valid details in all fields
    And Submits the registration form
    Then The user is registered successfully and is logged into the website
    And The account balance is "5,550" virtual chips