Feature: Home Page testing
Background:
Given  user is on homepage
When he mouse over service providers

@smoke
Scenario: To assert network hospital is displayed
Then He can see list of options
|Network Hospitals|Excluded Hospitals|Network Labs|
|HealthCheckupAtLab|HealthCheckupAtHome|HealthCheckUpAtIndustry|

@regression
Scenario: To assert network hospital is displayed
Then he can see "Excluded Hospitals" option

@smoke @regression
Scenario: To assert network hospital is displayed
Then he can see "Network Labs" option