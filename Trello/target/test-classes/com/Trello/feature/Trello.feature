Feature: Create List and drag the card in Trello Application

Scenario: Create List and drag the card in Trello Application

Given User Launch The Application
When a user login into application
And user create a new Board
And user create a "list A"
And user create a "list B"
And user add a card in "list A" parameter as "Test"
And user drag and drop the "list A" card to "list B" card
Then user logout the application
