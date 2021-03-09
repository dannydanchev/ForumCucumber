
Feature: Create a new section

  Scenario Outline: Create a new forum section
    Given User has moderator rights
    And User clicks the New Section button
    When Enters section name "<name>"
    And Enters a section description "<description>"
    And Clicks on the Create Section button
    Then User sees the message "<message>"

    Examples: 
      | name  	 | description | message  |
      | section2 | description |Forum section successfully created|
      |          | description |Please enter a section name|
      | section2 |             |Please enter a section description|
      | section1 | description |This section already exists|
      |          |             |Please enter a section name and description|

   Scenario: Create a new forum section without moderator rights
    Given User does not have moderator rights
    And User clicks the New Section button
    Then User sees the message "You don't have rights to create a section!"