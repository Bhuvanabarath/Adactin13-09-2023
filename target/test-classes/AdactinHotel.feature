Feature: Validing Hotel booking Funtionality

  Scenario Outline: Validating login with vaild username and password
    Given User is on Adactin login page
    When user enter "<username>" and "<password>"
    And User click on login button
    Then Validate Home page
    When User enter "<location>","<hotel>","<roomType>","<noofroom>","<cindate>","<coutdate>",and "<adult>"
    Then User click on serach button
    And User select hotel
    When User add guest details "<firstname>","<lastname>","<address>","<ccno>","<ctype>","<month>","<year>" and "<ccvno>"
    Then User check the booking order id

    Examples: 
      | username | password | location | hotel          | roomType | noofroom | cindate    | coutdate   | adult   | firstname | lastname | address | ccno             | ctype | month | year | ccvno |
      | BhuvanaM | 827E8V   | Paris    | Hotel Sunshine | Deluxe   | 1 - One  | 27/08/2023 | 28/08/2023 | 1 - One | Bhuvana   | Barath   | Chennai | 1234123412341234 | MAST  |    10 | 2025 |   327 |

  Scenario Outline: Validating login with vaild username and password
    Given User is on Adactin login page
    When user enter "<username>" and "<password>"
    And User click on login button
    Then Validate Home page
    When User enter "<location>","<hotel>","<roomType>","<noofroom>","<cindate>","<coutdate>",and "<adult>"
    Then User click on serach button
    And User select hotel
    When User add guest details "<firstname>","<lastname>","<address>"
    And Enter card details
      | ccno             | ctype | month | year | ccvno |
      | 1234123412341234 | MAST  |    10 | 2025 |   327 |
      | 1212343456567878 | VISA  |     3 | 2026 |   732 |
      | 2121434365658787 | AMEX  |     5 | 2027 |   123 |
    Then User check the booking order id

    Examples: 
      | username | password | location | hotel          | roomType | noofroom | cindate    | coutdate   | adult   | firstname | lastname | address |
      | BhuvanaM | 827E8V   | Paris    | Hotel Sunshine | Deluxe   | 1 - One  | 27/08/2023 | 28/08/2023 | 1 - One | Bhuvana   | Barath   | Chennai |
