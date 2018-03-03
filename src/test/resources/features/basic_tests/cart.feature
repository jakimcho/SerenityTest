Feature: Shopping Cart

  Background:
    Given I am on "Home" page

  Scenario: Add two items to the shopping cart
    Given I have navigated to "Product Category" page
    When I add to Cart items:
      | iPhone 5 | Magic Mouse |
    Then I should see 2 items in the Cart


  Scenario: Remove items from the shopping cart
    Given I have 2 items in the Cart
    And I have navigated to "Checkout" page
    When I remove the 1st item from the Cart
    Then I should see 1 item in the Cart

  Scenario: Purchase items from the card
    Given I have 2 items in the Cart
    And I have navigated to "Checkout" page
    When Start the checkout process with billing detils:
      | first_name | last_name | address     | city  | state   | country   | phone  | shipping_address        |
      | Yakim      | Rachev    | V.Drumev 51 | Sofiq | Bularia | Boulgaria | 234324 | Same as billing address |
    And I purchase
    Then I should see the total amount of my order
