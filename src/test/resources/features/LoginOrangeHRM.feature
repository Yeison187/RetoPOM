# new feature
# Tags: optional

Feature: Yo como administrativo puedo iniciar sesion en el aplicativo

  Background:
    Given necesito ingresar al sistema OrangHRM

  Scenario Outline: Inicio sesion invalido
    When ingreso un <user>
    And  una <pass>
    Then al dar click en el boton Login <mensaje>

    Examples:
      | user  | pass     | mensaje             |
      | Admin | admin124 | Invalid credentials |
      | admi  | admin123 | Invalid credentials |


  Scenario: Inicio sesion campos vacios
    Then al dar click en el boton Login Username cannot be empty

  @validSesion
  Scenario: Inicio sesion valido
    When ingreso un Admin
    And  una admin123
    Then al dar click en el boton Login, debe ingresar al sistema




