Feature: As a user, I want to be 
able to login and logout.

Background: See landing page
Given I launch the "url"
Then I see the "Login" page displayed

Scenario: Login 
Given am on the "Login" page
And I enter my "Username" as "wegit"
And I enter my "Password" as "12345678"
When I click "Login" button
Then I see the "Home" page displayed

Scenario: Logout
Given am on the "Home" page
When I click "Logout" link
Then I see the "Home" page displayed