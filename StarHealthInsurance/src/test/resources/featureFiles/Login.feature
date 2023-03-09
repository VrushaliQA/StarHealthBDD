Feature: Login Page testing
Background:
Given  user is on homepage
And he mouse over on sign in
And click on Retail customer


@smoke
Scenario: valid credentials
When he enters the email Id and passwords as
|email|password|
|vrushali@gmail.com|vrushali|
|savi@gmail.com|savi|
And click on continue
Then he can log in to his account

