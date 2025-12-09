Feature: New Playlist feature

Scenario: Create New Playlist
  Given I open browser
  And I open Login page
  When I enter email "felicia.clay@testpro.io"
  And I enter password "ACw0FWOe#4"
  And I submit
  And I click on New Playlist
  And I enter New Playlist Name "Test Playlist"
  Then New Playlist is displayed "Test Playlist"


Scenario: Same Name Playlist
  Given I open browser
  And I open Login page
  When I enter email "felicia.clay@testpro.io"
  And I enter password "ACw0FWOe#4"
  And I submit
  And I click on New Playlist
  And I enter New Playlist Name "Test Playlist"
  Then New Playlist is displayed "Test Playlist"

Scenario: Less than 3 char Playlist
    Given I open browser
    And I open Login page
    When I enter email "felicia.clay@testpro.io"
    And I enter password "ACw0FWOe#4"
    And I submit
    And I click on New Playlist
    And I enter New Playlist Name "T1"
    Then New Playlist is displayed "T1"