Feature: Register feature

  @Register
  Scenario: User should be able to register successfully.
    Given user is on Homepage
    When user click on Register button
    And user enter all required details
    And click on Register button
    Then user be able to see Your registration completed message