Feature: Validating login funtionality

  Scenario: Validate Login funtion with 2D-without Header
    Given User is on facebook page
    When User enter username and password
      | Bhuvana | Bhuvana@1530 |
      | Barath  | Batath@1530  |

  Scenario: Validate Login funtion with 2D-with Header
    Given User is on facebook page
    When User enter username, password
      | username | password     |
      | Bhuvana  | Bhuvana@1530 |
      | Barath   | Batath@1530  |
