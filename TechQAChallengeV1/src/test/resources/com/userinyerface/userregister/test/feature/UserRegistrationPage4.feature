Feature: User Registration Page1

  Background: 
    Given I want to register in userinyerface.com page
    When I click Here to go to next page
    And I fill out the form with
      | password   | email | domain | ext  |
      | 1234БTest1 | test1 | mborda | .com |
    And I accept terms and conditions
    And I click Next
    When I upload a image
      | path   |
      | prueba |
    And I deselect all interests
    And I chose three interests
    And I click button Next
    When I fill out the third form with
      | firstName | zip    | title | city   | surname | street   | box | number | bDay | bMonth | bYear | age | gender |
      | Maria     | 110011 | Mrs   | Bogota | Perez   | calle123 |   3 |      4 |    7 | August |  1994 |  26 | Female |

  @tag1
  Scenario: Fill out fourth page
    When I check all checkbox
    And Validate that i am not a robot
    Then I will see the message
      | elementPresent   |
      | YOU ARE AWESOME! |
