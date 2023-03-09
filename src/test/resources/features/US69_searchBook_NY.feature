@wip
Feature: books search

  Background: User should already on the Books page
    Given the user is on the login page
    And user login to application as a student

  Scenario: Verify book search results
    When user navigate to Books page
    And user search for "The Goldfinch"
    Then books table should contain results matching

      | ISBN.    | 387927210592  |
      | Name     | The Goldfinch |
      | Author   | Donna Tart    |
      | Category | Drama         |
      | Year     | 2013          |


