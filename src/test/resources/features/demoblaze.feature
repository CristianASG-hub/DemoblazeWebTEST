Feature: Test Web Actions

    We are going to test every actions you can do in the webpage.


  Scenario Outline: Navigate through demoblaze
    Given I navigate to demoblaze
    Then I go to <section> using navigation bar
    Examples:
      | section  |
      | Sign up  |

    Scenario: Click on the celullar picture
       Given I navigate to demoblaze
       Then I go to Phones categories
       Then Click on the first picture of the categorie