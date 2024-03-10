#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@flyaway
Feature: Title of your feature
  I want to use this template for my feature file

  @Registration
  Scenario Outline: Validate Registration flow in flyaway
    Given User launch flyaway application url
    When User clicks on Signup link, Registration page opens
    And User enters registration details: "<email>", "<pwd>", "<cpwd>", "<name>", "<address>" and "<city>"
    And User clicks on SignUp button
    Then User should be registered successfully
    Then validate the user details stored in database

    Examples: 
      | email             | pwd    | cpwd   | name    | address          | city   |
      | user036@admin.com | admin1 | admin1 | user036 | no 35 1st street | Kerala |

  @Login
  Scenario Outline: Validate Login flow in flyaway
    Given User clicks on login link, login page opens
    When User enters login details: "<email>" and "<pwd>"
    And User clicks on login button
    Then User should be logged in successfully

    Examples: 
      | email             | pwd    |
      | user036@admin.com | admin1 |

  @SearchFlight
  Scenario Outline: Validate search flight flow in flyaway
    Given User clicks on Home
    When user selects the "<source>" and "<destination>"
    And clicks on Search button
    Then flight details will be displayed

    Examples: 
      | source    | destination |
      | Bangalore | Chennai     |

  @BookFlight
  Scenario: Validate Book flight flow in flyaway
    When User click on Bookflight link
    And User confirms the payment gateway
    Then Booking should be successfull.
