Feature: Check the json placeholder api
  Scenario: As a user I would like to check the get response for the /posts endpoint
    Given I am using the json placeholder typicode env
    When I make the get request to "/posts/1" endpoint
    Then I get a response with id = 1