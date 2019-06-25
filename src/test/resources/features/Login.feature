Feature: Application Login

  @MobileTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "james" and "5268"
    Then Home page is populated
    And Cards are displayed


  @SmokeTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "john" and "4321"
    Then Home page is populated
    And Cards are not displayed

  @WebTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User sign up with following details
      |Jenny |abcd |jenny@gmail.com |SA |654321|
    Then Home page is populated
    And Cards are displayed

  @WebTest
  Scenario Outline: Home page default login
    Given User is on NetBanking landing page
    When  User login in to application with "<username>" and "<password>"
    Then Home page is populated
    And Cards are displayed
    Examples:
      |username  | password|
      |Pink      | Rose    |
      |May       | Weather |
      |Bart      | Simpson |
      |Sam       | Smith   |
