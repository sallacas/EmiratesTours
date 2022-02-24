# autor: Johnatan-Casallas | Language: en
@stories
Feature: Emirates - Tours & Activities
  as a user, I want to automate the booking flow for an activity (without payment)
  @scenario1
  Scenario: Make a reservation of an activity (without payment)
    Given Juan want to access the Emirates Tours & Activities page
    When he finds an activity he is interested in booking
    | destination | fullname        | email                   | phone       |
    | Miami       | Johnatan Cajaia | dragonviolet@gmail.com  | 3112543900  |
    Then he will be able to validate the booking process (without payment)
