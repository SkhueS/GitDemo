Feature: Portal Login
#background and hooks cant be used together, use hooks if the tag names are different, hence you want different things to be displayed before and after each test but use background if the tags are the same
  Background:
    Given Validate the browser
    When  Browser is triggered
    Then check if browser is started

  @PortalTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with username and password
    Then Home page is populated
    And Cards are displayed
  @PortalTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "james" and "5268"
    Then Home page is populated
    And Cards are displayed


  @PortalTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "john" and "4321"
    Then Home page is populated
    And Cards are not displayed

  @PortalTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User sign up with following details
      |Jenny |abcd |jenny@gmail.com |SA |654321|
    Then Home page is populated
    And Cards are displayed

  @PortalTest
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


