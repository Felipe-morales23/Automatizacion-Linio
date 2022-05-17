Feature: Buy products
  As a user, I need to purchase
  several products.

  Scenario: Enter products and remove them in the shopping cart
    Given the user is in the application https://www.linio.com.co/
    When the user is directed to the category "Hogar" section "confort para tu habitacion"
    And select the required product and add three quantities to the cart
    And the user will see the total of the purchase and will eliminate the product
    Then the user will see the message "NO TIENES PRODUCTOS EN TU CARRITO"
