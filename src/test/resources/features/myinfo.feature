Feature: Personal Details

  Background: I login to site
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user is navigated to the dasboard page

  Scenario: User can fill up the form of Person Details
    Given I login to site
    And I click My Info Tab
    Then I see My Info page display
    And I click on Personal Details form left menu
    And I click on Edit button
    And I provide First Name, Middle Name and Last Name in Full Name field
    And I provide Employe Id in Employee ID field
    And I provide Other Id in Other ID field
    And I provide Drivers License Number in Drivers License field
    And I provide License Expiry Date
    And I provide SSN Number
    And I provide Sin Number
    And Select Gender Male/Female radio button
    And I select Married in Maritial Status from dropdown
    And I select American from Nationality dropdown
    And I enter 1980-01-01 in Date of Birth field
    And I provide Nick Name in Nick Name field
    And I select Check box in Smoker
    And I provide Militay Service in Military Service
    And click Add button
    And I Upload file from sample data (create sample data folder inside project and select from there)
    And I provide Comment in comment box
    And I click Upload
    Then Verify that Upload is Successful
    And Select one item from table and Delete
