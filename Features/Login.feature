Feature: testing of all login scenarios


  Scenario: to test the functionality of login button for valid input
    Given I am on login page
    When  I enter valid username valid password
    And I click on login button
    Then I should be land up to the home page


    @AnotherLogin
  Scenario: to test the functionality of login button for valid input on another login page
    Given I am on billing login page
     # When  I enter valid username, password
      When  I enter "admin1" , "pass1"
      And I click on login
    Then I should be land up to the dashboard


  @AnotherLogin
  Scenario: to test the functionality of login button for invalid input on another login page
    Given I am on billing login page
   # When  I enter invalid username, password
    When  I enter "admin2" , "pass2"
    And I click on login
    Then I should get error message


  @AnotherLogin
  Scenario: to test the functionality of login button for blank input on another login page
    Given I am on billing login page
   # When  I dont enter username, password
    When  I enter "" , ""
    And I click on login
    Then I should get another error

  @userReg
  Scenario: do the user registration
      Given I am on user registration page
      When I enter below Data
      | Amol | Ujagare | 898989 | amol@gmail.com |
      And I click on save button
      Then data Should be inserted

  @userReg2
  Scenario Outline: do the another user registration
    Given I am on another user registration page
    When I enter <firstName> , <lastName> ,<email>
    And I click on submit button
    Then Record Should be inserted

    Examples:
    | firstName | lastName  | email  |
    | name1     | lastname1 | email1 |
    | name2     | lastname2 | email2 |
    | name3     | lastname3 | email3 |
    | name4     | lastname4 | email4 |
    | name5     | lastname5 | email5 |

