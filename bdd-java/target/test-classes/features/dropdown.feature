Feature: Dropdown functionality

  Scenario: Select an option from the dropdown
    Given I am on the dropdown page
    When I select "Option 1" from the dropdown
    Then I should see "Option 1" selected