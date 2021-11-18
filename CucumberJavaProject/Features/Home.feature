Feature: Amazon homepage

  Scenario: Successfully navigating to Kindle
    Given User launches Chrome browser
    When User enters "https://www.amazon.ca"
    And User clicks on the hamburger menu
    And User selects Kindle under Digital Content
    And User selects Kindle under e-readers
		And User clicks on Buy Now 
		And Verify user is asked for email or mobile number
		And close the browser