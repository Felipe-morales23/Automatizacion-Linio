Feature: Buy products
  As a user, I need to purchase
  several products.

  Scenario: Enter products and remove them in the shopping cart
    Given the user is in the application https://www.linio.com.co/
    When the user goes to the home category and searches for the required product
    Then the system will display a message which will show that the product was added correctly <message>
    And the user will remove the products from the cart and will see an empty cart message <noproducts>
      | message                          | noproducts                        |
      | Tu producto se agregó al carrito | NO TIENES PRODUCTOS EN TU CARRITO |
