@tag
Feature: User Registration Page1

  @tag1
  Scenario Outline: Fill out first page
    Given I want to register in userinyerface.com page
    When I click Here to go to next page
    And I fill out the form with
      | password   | email   | domain   | ext   |
      | <password> | <email> | <domain> | <ext> |
    And I accept terms and conditions
    And I click Next
    Then I will see
      | elementPresent   |
      | <elementPresent> |

    Examples: 
      | password   | email | domain | ext  | elementPresent |
      | 1234БTest1 | test1 | mborda | .com | This is me     |

  
  