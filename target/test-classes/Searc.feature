
Feature: Filters
  As a end user
  I want filter the search results
  So that i can view refined products

  Scenario: Filter By customer Rating
    Given I am Homepage
    When I search for a product "nike"
    Then I should be able to see the respective results



