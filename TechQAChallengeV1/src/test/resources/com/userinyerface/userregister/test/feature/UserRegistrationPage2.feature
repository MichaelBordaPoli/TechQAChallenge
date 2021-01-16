Feature: User Registration Page1

  Background: 
    Given I want to register in userinyerface.com page
    When I click Here to go to next page
    And I fill out the form with
      | password   | email | domain | ext  |
      | 1234БTest1 | test1 | mborda | .com |
    And I accept terms and conditions
    And I click Next

  @tag1
  Scenario: Fill out second page
    When I upload a image
      | path                                                                      |
      | C:\\Users\\usuario\\eclipse-workspace\\TechQAChallengeV1\\img\\avatar.png |
    And I deselect all interests
    And I chose three interests
    And I click button Next
    Then I will see the text
      | elementPresent   |
      | Personal details |
