Feature: Restaurant Ordering System

  Scenario: User browses the menu
    Given the user is on the restaurant homepage
    When the user navigates to the menu page
    Then the menu items should be displayed

  Scenario: User adds an item to the cart
    Given the user is on the menu page
    When the user clicks "Add to Cart" on a menu item
    Then the cart count should increase by 1

  Scenario: User completes checkout
    Given the user has items in the cart
    When the user proceeds to checkout
    And the user fills in their delivery details
    Then the order confirmation should be displayed