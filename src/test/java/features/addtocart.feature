Feature: Validate Cart Functionality on Chiltern Oak Furniture Website

  Scenario: Add Products to Cart
    Given I am on the Chiltern Oak Furniture website
    Then User search the product 
    Then User Click on search button
    When I add Product1 to the cart
    Then i click on continue shopping
    Then I add Product2 to the cart
    