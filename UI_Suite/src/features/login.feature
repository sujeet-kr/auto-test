
Feature: This is a test feature file and should be used for references

  @run1
  Scenario: Login to the application
    Given I am at the login page
    When I login to the application
    Then I navigate to the Flight Finder page of the application
    And I see the action for move to footer happed
