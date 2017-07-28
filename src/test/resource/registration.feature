Feature: As a user,
I want to be able to register

#Gherkin syntax in jobspec, Given When And Then, But

Background: See landing page
Given I launch the "url"
Then I see the "Login" page displayed

Scenario: Register
Given I click "register" button
And I enter "Email address"
When I enter "Preffered_username"
And I enter "Password"
Then I enter "confirm_password"
And I click "register_on_form" button
And I see the "Home" page displayed
