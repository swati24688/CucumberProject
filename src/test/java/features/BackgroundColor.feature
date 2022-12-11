@BackgroundColorValidation @Regression
@BackgroundColor
Feature: Background color change functionality validation

@Scenario1 @Smoke
Scenario: User should be change the background color 
Given User is on set background page
When User click on the skyblue button
Then The background color will change to sky blue

@Scenario2 @Smoke
Scenario: User should change the background color
Given User is on set background page
When User click on the white button
Then The background color will change to white

