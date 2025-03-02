Feature: Test Web Actions

    We are going to test every actions you can do in the webpage.


    Scenario: Navigate through demoblaze

        Given I navigate to demoblaze
        Then I go to <section> using navigation bar
        Examples:
            | section  |
            | Home     |
            | Contact  |
            | About us |
            | Cart     |
            | Log in   |
            | Sign up  |