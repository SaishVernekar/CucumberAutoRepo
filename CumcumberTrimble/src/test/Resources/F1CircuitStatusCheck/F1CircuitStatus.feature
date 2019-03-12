Feature: F1 Circuit Rest Assured Test
Scenario: Test GET Method

Given user start the rest assured test
When user hit the get request
Then user checks the count or size
Then user checks "albert_park" value
Then user checks at path "MRData.CircuitTable.Circuits.circuitId[0]" with the "albert_park" value
