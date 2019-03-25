@Test
Feature: Demo automating Testing

Scenario: Automation testing URl demo

Given user is on Demo Site Testing page
When user launch app with URL 
Then user clicks on skip sign in
Then user is on Automation Demo Site page
Then Enter as "Yashini" into firstname
Then Close the browser
@Test2
Scenario: Register Page Testing
Given user is on Demo Site Testing page
When user launch app with URL 
Then user clicks on skip sign in
Then user is on Automation Demo Site page
Then enter text for name field
Then Close the browser