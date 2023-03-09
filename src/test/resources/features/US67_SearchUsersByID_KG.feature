Feature: Library search functionality

  Agile Story: Librarian should be able to search users by ID.


  #Background: For all scenarios user is on the login page of the library application
  #  Given user is on the login page of the library application


  Scenario Outline: Search User By ID with Scenario Outline

    Given the user is on the login page
    And user login as a librarian
    And user click on Users link
    When user enters "<searchValue>" in the search box
    Then user should sees "<UserId>" is in the userIDHeader
    Then user should sees "<FullName>" is in the fullNameHeader
    Then user should sees "<Email>"  is in the emailHeader

    Examples: search values are going to be using in this scenario outlines
      | searchValue | UserId | FullName | Email     |
      | 842         | 842    | John Doe | hello@hi0 |




