Feature: Update Password feature

  Scenario:  Upper and Lower Character Password
    Given I open browser
    And I open Login page
    When I enter email "felicia.clay@testpro.io"
    And I enter password "ACw0FWOe#4"
    And I submit
    And I open Profile page
    And I enter current password "ACw0FWOe#4"
    And I enter new password "ACwoFWoetd"
    And I Save
    Then Password is not Updated

  Scenario:  All Symbol Character Password
    Given I open browser
    And I open Login page
    When I enter email "felicia.clay@testpro.io"
    And I enter password "ACw0FWOe#4"
    And I submit
    And I open Profile page
    And I enter current password "ACw0FWOe#4"
    And I enter new password "!@#$%^&*()"
    And I Save
    Then Password is not Updated

  Scenario:  All Numbers Character Password
    Given I open browser
    And I open Login page
    When I enter email "felicia.clay@testpro.io"
    And I enter password "ACw0FWOe#4"
    And I submit
    And I open Profile page
    And I enter current password "ACw0FWOe#4"
    And I enter new password "1234567890"
    And I Save
    Then Password is not Updated

  Scenario:  No Symbols Character Password
    Given I open browser
    And I open Login page
    When I enter email "felicia.clay@testpro.io"
    And I enter password "ACw0FWOe#4"
    And I submit
    And I open Profile page
    And I enter current password "ACw0FWOe#4"
    And I enter new password "ACw0FWOe34"
    And I Save
    Then Password is not Updated

  Scenario:  Less than 10 Character Password
    Given I open browser
    And I open Login page
    When I enter email "felicia.clay@testpro.io"
    And I enter password "ACw0FWOe#4"
    And I submit
    And I open Profile page
    And I enter current password "ACw0FWOe#4"
    And I enter new password "ACwFWOe#4"
    And I Save
    Then Password is not Updated

  Scenario:  More than 15 Character Password
    Given I open browser
    And I open Login page
    When I enter email "felicia.clay@testpro.io"
    And I enter password "ACw0FWOe#4"
    And I submit
    And I open Profile page
    And I enter current password "ACw0FWOe#4"
    And I enter new password "ACw0FWOe#4567890123"
    And I Save
    Then Profile has been updated

  Scenario:  Update 10 Character Password
    Given I open browser
    And I open Login page
    When I enter email "felicia.clay@testpro.io"
    And I enter password "ACw0FWOe#4567890123"
    And I submit
    And I open Profile page
    And I enter current password "ACw0FWOe#4567890123"
    And I enter new password "ACw0FWOe#4"
    And I Save
    And Profile has been updated
    And I open browser
    And I open Login page
    And I enter email "felicia.clay@testpro.io"
    And I enter password "ACw0FWOe#4"
    Then I submit