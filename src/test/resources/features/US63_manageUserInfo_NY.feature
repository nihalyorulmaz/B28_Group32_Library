
Feature: manage user info table

  Background: User should already on the Users page
    Given the user on the login page
    And user login as a librarian

  Scenario: Change number of rows in Users page

    And user click on Users link
    When user select Show "50" records
    And show records value should be "50"
    Then the users table must display "50" records
