@login @regression

Feature: WebDriver University - Login page

  Background:
    Given I access the WebDriver University login page

  
  Scenario Outline: Validate successful and unsuccessful login
    When I enter a username <username>
    And I enter a password <password>
    And I click on the button
    Then I should be presented with an alert with <loginValidationMessage>

    Examples:
      | username  | password     | loginValidationMessage |
      | webdriver | webdriver123 | "validation succeeded" |
      | webdriver | webdriver1   | "validation failed"    |
      | joeBlogs  | password1    | "validation failed"    |
