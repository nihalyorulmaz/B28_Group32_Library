@wip
Feature: manage user info table

  Background: User should already on the Users page


  Scenario: Change number of rows in Users page
    Given the user on the login page
    And user login as a librarian

    And user click on Users link
    When user select Show "50" records
    Then show records value should be "50"
    #And the users table must display "50" records
