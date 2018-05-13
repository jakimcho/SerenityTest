Feature: Login

  In order to use system functionalities with my account preferences I want to be able to log in.
  In order to prevent others to use my account I want to have an option to log out.

  Background:
    Given Login page is open

  Scenario: Successful Login
    When I complete login form:
      | username | password  |
      | minko    | Pak@d43sK |
    Then system let me log in successfully

  Scenario Outline: Unsuccessful Login
    When I complete login form:
      | username     | password         |
      | <wrong_user> | <wrong_password> |
    Then system let me log in successfully

    Examples:
      | wrong_user | wrong_password |
      | dsda       | fdsfsdfs       |
      | minko      | pak@d43sK      |
      | minkoo     | Pak@d43sK      |

