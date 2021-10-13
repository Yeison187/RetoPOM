# new feature
# Tags: optional
@Orange
Feature: Yo como administrativo puedo iniciar sesion en el aplicativo

  Scenario Outline: Inicio sesion correcto
    Given necesito ingresar al sistema OrangHRM
    When ingreso un <user>
    And  una <pass> valida
    Then al dar click en el boton debo ingresar al sistema

    Examples:
    |user | pass   |
    |Admin|admin123|
