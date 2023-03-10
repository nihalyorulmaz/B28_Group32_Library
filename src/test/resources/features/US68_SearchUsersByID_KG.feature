Feature: Library search functionality

  Agile Story: Librarian should be able to search users by ID.

  Acceptance Criteria:
  1. Verify librarians can search users by ID.



  @B28G32-76
  Scenario Outline: Librarian should be able to search User By ID with Scenario Outline
    Given the user is on the login page
    And user login as a librarian
    And user click on Users module
    When user enters "<searchValue>" in the search box
    Then user should sees "<UserId>" is in the userIDHeader
    Then user should sees "<FullName>" is in the fullNameHeader
    Then user should sees "<Email>"  is in the emailHeader

    Examples: search values are going to be using in this scenario outlines
      | searchValue | UserId | FullName         | Email                           |
      | 486         | 486    | Asuncion Pfeffer | Oralia Daugherty234@library.com |




