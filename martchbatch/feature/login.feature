Feature: verify the login 

Scenario: login to the opencart
    Given Lanch the URL
    And Navigate to the login page
    And enter username and password
    When click on login button
    Then login should be successfull