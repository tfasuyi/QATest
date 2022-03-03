Feature: As a user I want to be able to add a list of strings
  I want to see the number of vowels in each of the strings that I have entered

  Scenario: I should not be able to add more than four strings
    Given I enter a string above four
    When I execute the tests
    Then i should get an error message

  Scenario: I should be  able to see the  number of vowels and consonant in each of the strings
    Given I enter a string
    When I execute the testss
    Then i should get the total number of both vowels and consonant

  Scenario: I should be able to see the number of vowels in a string
    Given I enter a string
    When I execute the test
    Then i should be able to see the total number of vowels

  Scenario: I should be able to see the number of consonant in a string
    Given I enter a string
    When I execute test related
    Then i should be able to see the total number of consonant




