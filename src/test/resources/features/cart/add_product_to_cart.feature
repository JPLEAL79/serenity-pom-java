@ui @cart
Feature: Carrito de compras en Saucedemo
  Como usuario autenticado
  Quiero agregar un producto al carrito
  Para validarlo en la vista del carrito


  Background:
    Given que el usuario abre la aplicación


  Scenario: Agregar un producto y validarlo en el carrito
    Given que el usuario ha iniciado sesión con usuario "standard_user" y password "secret_sauce"
    When agrega el producto "Sauce Labs Backpack"
    And navega al carrito
    Then debería ver el producto "Sauce Labs Backpack" en el carrito