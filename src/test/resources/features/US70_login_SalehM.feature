Feature: Library Login Features
  Agile User Story: As a librarian,I want to login and access to the dashboard page


  Scenario: User should be able to login with any librarian credentials
    Given  user is on the login page
    When  user enter valid username
    Then user should see dashboard page