
Feature: To read data from Datatable 
  Scenario: Validate parameters from datatable 
Given user hit the post request with "Jai" name
Then user validate following data
|param|Value|
|id|notNull|
|statusCode|200|
