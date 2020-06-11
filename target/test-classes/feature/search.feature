Feature: To search the products
Scenario Outline: To verify user can search the products 
Given user has to be there in catch website 
When user has to "<search>" the products 
And user has to click serach button 
Then user has to see the search results 

Examples:
|search|
|iphone|
|Samsung|
|oppo|
 