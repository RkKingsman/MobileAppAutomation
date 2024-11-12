Feature: Calculator UI Test

  Scenario: User performs summing operation
    Given User is on calculator home screen
    When User clicks on five
    And User clicks on plus
    And User clicks on eight
    And User clicks on equals
    Then User should see result message