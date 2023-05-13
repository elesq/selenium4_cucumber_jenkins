@contact-us @regression
Feature: WebDriver University - Contact Us page

  Background:
    Given I access the WebDriver University contact us page

  Scenario: Validate successful submission - Unique data
    When I enter a unique first name
    And I enter a unique last name
    And I enter a unique email address
    And I enter a unique comment
    And I click on the Submit button
    Then I should be presented with a successful contact us submission message

  Scenario: Validate successful submission - specific data
    When I enter a specific first name Sarah
    And I enter a specific last name Conner
    And I enter a specific email address sarah@skynet.io
    And I enter a specific comment "Have you seen John?"
    And I click on the Submit button
    Then I should be presented with a successful contact us submission message
