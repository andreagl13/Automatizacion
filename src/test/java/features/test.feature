
Feature: Topic Comics
  I'm a user what I want to read test junks for laugh me and I will have a good time

  Scenario Outline: Drinking
    Given There is <start> beers
    When  I drink <drink> beers
    Then  Only there will be <total> beers
    Examples:
      | start | drink | total |
      | 10    | 5     | 5     |
      | 10    | 10    | 3     |