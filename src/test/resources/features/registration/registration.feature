Feature: Light registration

  The potential users should be able to make a registration on the Jack casino website.

  Background:
    Given "landing" page is opened
    And The "sign up" form is opened


  @sanity-check @reporting
  Scenario Outline: Successful registration on the site <title>
    When The user enters valid details in all fields
    And Submits the registration form
    Then The user is registered successfully and is logged into the website
    And The account balance is "5,550" virtual chips

    Examples:
      | title  |
      | Gogogo |
      | Mitko  |

  @manual @reporting
  Scenario: Manual Successful registration on the site
    When The user enters valid details in all fields
    And Submits the registration form
    Then The user is registered successfully and is logged into the website
    And The account balance is "5,550" virtual chips