Feature: Create new address

  Scenario: User can log in and create new address
    Given Browser with open page at address https://mystore-testlab.coderslab.pl
    When Clicked SingIn
    And Entered email atqqbdyresgdnwksue@nthrl.com password Alex!
    And Clicked ADD FIRST ADDRESS
    And Entered Edytaa! in the search input box Alias
    And Entered ul. Marka 52 in the search input box Address
    And Entered London in the search input box City
    And Entered 11-254 in the search input box Zip Postal Code
    And Entered United Kingdom in the search input box Country
    And Entered 123 525 525 in the search input box phone
    And Clicked Save
    And Check in the date address
    Then Delete address

