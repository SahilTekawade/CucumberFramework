Feature: Free CRmpro login smoke scenario

Scenario: verify  freecrm pro login page with valid credential
Given user should be on freecrm pro login page 
When Enter valid username and Valid user password
Then click on submit btn
Then user should be on homepage