Feature: Catalog Redirection
  As a user
  I want to test all Catalog buttons
  So that can be sure that user can be redirected to specific page of product

  Scenario: Redirecting to the Catalog page
    Given User opens Touch Home page
    When User goes to catalog and click on Catalog button
    Then User is redirected to Catalog page

  Scenario: Redirecting to the Apple product page
    Given User opens Touch Home page
    When User goes to catalog and click on Apple product
    Then User is redirected to Apple product page

  Scenario: Redirecting to the Xiaomi product page
    Given User opens Touch Home page
    When User goes to catalog and click on Xiaomi product
    Then User is redirected to Xiaomi product page


