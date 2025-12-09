Feature: Account Creation feature

  Scenario: Create Account
    Given I open browser
    And I open Registration page
    And I Register new email "test@gmail.com"
    And I click on Registration Submit
    And I view Registration Message
    Then I print Error Message

  Scenario: Create Account with plus sign
    Given I open browser
    And I open Registration page
    And I Register new email "test+1gdrhgdrherahdz23346456@gmail.com"
    And I click on Registration Submit
    And I view Registration Message
    Then I print Error Message

  Scenario: Create Account with duplicate registration
    Given I open browser
    And I open Registration page
    And I Register new email "felicia.clay@testpro.io"
    And I click on Registration Submit
    And I view Confirmation Registration Message
    Then I print Confirmation Message