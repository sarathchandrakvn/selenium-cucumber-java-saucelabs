Feature: Amazon Search Process


  @search
  Scenario Outline: User should be able to Navigate to Amazon com page and search for a product
    Given I am open Amazon Webpage
    And I search for a "<product>"
    Then I should see results

    Examples:
    |product|
    | watch |
    | iphone|
