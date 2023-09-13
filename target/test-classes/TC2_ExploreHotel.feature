Feature: Verifying Adacting hotel login funtionality and Explore hotel

  Scenario Outline: Verifying login with valid credential and enter only mandatory fields then verify select hotel
    Given User in on Adactin hotel page in chrome browser
    When User login "<username>" and "<password>"
    Then User shoould verify success message after login "Hello BhuvanaM"
    When User enter only mandatory fields "<%dlocation>","<%dnoofroom>","<indate>","<outdate>"and "<%dadult>"
		Then User click on search button
    Examples: 
      | username | password | location | noofroom | indate     | outdate    | adult |
      | BhuvanaM | 827E8V   |        5 |        2 | 26/08/2023 | 27/08/2023 |     2 |
