Feature: Search
  As a user
  I want to test a searching field
  So that can be sure that user can find what is he looking for

  Scenario Outline: Check finding a product
    Given User opens Touch Home page
    When User searching a product by keyword '<product>'
    And User clicks search button
    Then User can see amount of products with a '<product>'


    Examples:
    | product |
    | iPhone  |
    | MacBook |
    | Xiaomi  |

