@ui @login
Feature: Autenticación en Saucedemo
  Como usuario
  Quiero iniciar sesión
  Para acceder a la aplicación

  Background:
    Given que el usuario abre la aplicación

  @positive
  Rule: Autenticación válida
  Scenario Outline: Login con credenciales válidas
    When se autentica con usuario "<usuario>" y password "<password>"
    Then el login debería ser exitoso

    Examples: Válidas
      | usuario       | password     |
      | standard_user | secret_sauce |

  @negative
  Rule: Autenticación inválida
  Scenario Outline: Login rechazado por credenciales inválidas o faltantes
    When se autentica con usuario "<usuario>" y password "<password>"
    Then debería ver el mensaje de error "<mensaje>"

    Examples: Inválidas
      | usuario        | password     | mensaje                                        |
      | incorrect_user | secret_sauce | Username and password do not match             |
      |                | secret_sauce | Username is required                           |
