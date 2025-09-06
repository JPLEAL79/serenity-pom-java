@ui @cart
Feature: Carrito de compras en Saucedemo
  Como usuario autenticado
  Quiero agregar productos al carrito
  Para validarlos en la vista del carrito

  Background:
    Given que el usuario abre la aplicación

  Scenario Outline: Agregar distintos productos al carrito
    Given que el usuario ha iniciado sesión con usuario "standard_user" y password "secret_sauce"
    When agrega el producto "<producto>"
    And navega al carrito
    Then debería ver el producto "<producto>" en el carrito

    Examples:
      | producto                 |
      | Sauce Labs Backpack      |
      | Sauce Labs Bike Light    |
      | Sauce Labs Bolt T-Shirt  |
      | Sauce Labs Fleece Jacket |
      | Sauce Labs Onesie        |
