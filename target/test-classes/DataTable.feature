Feature: Amazon product search
	@smoke @reg
  Scenario: Validating seachbox in amazon home page
    Given User in on the amazon page
    When User search product
      | TV     |
      | Laptop |
      | Mobile |
	@sanity
  Scenario: Validating seachbox in amazon home page
    Given User in on the amazon page
    When User search product with Brand name
      | TV     | Sony    |
      | Laptop | HP      |
      | Mobile | Samsung |
