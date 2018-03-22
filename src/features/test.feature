
Feature: This is a test feature file and should be used for references

  @run1
  Scenario: Login to the application
    Given I am at the login page
    When I provide the login credentials
    Then I land in the landing page of the application

  @run2
  Scenario: Login to 2
    Given I am at the login page
    Then I land in the landing page of the application

  @run3
  Scenario: Login to 3
    Given I provide the login credentials
    Then I am at the login page