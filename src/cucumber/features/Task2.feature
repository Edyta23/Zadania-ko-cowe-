  Feature: Buying clothes

Scenario: User can log in and buying clothes
    Given Open page at address https://mystore-testlab.coderslab.pl/index.php
    When Click SingIn
    And Login email atqqbdyresgdnwksue@nthrl.com password Alex!
    And Clicked CLOTHES
    And Choose Hummingbird Printed Sweater
    And Choose size M
    And Choose 5 pieces
    And Add to cart
    And Click proceed to checkout
    And Click proceed to checkout again
    And User ul. Marka 52 in the search input box Address
    And User 11-254 in the search input box Zip Postal Code
    And User London in the search input box City
    And User United Kingdom in the search input box Country
    And User 123 525 525 in the search input box phone
    And Clicked shopping method
    And Clicked Continue
    And Choose  Pay by Check
    And Check the checkbox I agree to the terms of service and will adhere to them unconditionally
    And Clicked order with an obligation to pay
    Then Save screenshot

