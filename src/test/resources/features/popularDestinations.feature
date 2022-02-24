# autor: Johnatan-Casallas | Language: en
@stories
Feature: Emirates - Tours & Activities
  As a user I want to automate the search for tours and activities for the most popular destinations in emirates.
  @scenario1
  Scenario: Validate the search for activities in the most popular destinations of emirates
    Given Juan want to access the Emirates Tours & Activities page
    When he selects a destination, it validates that the interface corresponds to the destination and searches for activities
    | strDestination |
    | Roma        |
    Then he will be able to find the activities available at the selected destination
