Feature: User can login to site with valid credintials

  @smoke
  Scenario: Login to OrangeHRM site
    Given User is in OrangeHRM site
    When User enters a valid "Admin" in Username field
    And User enters a valid "admin123" in Password field
    And User clicks the Login button
    Then User is successfully navigated
