#Author: Dan J. Carrion
#Keywords Summary: Automation test for APAP

@General
Feature: APAP

  @APAP
  Scenario: Busqueda en APAP
    Given Inicializo el navegador
    Given Entro en APAP
    And Clickeo en Prestamos
    Then Imprimo la informacion
    And Cierro el navegador
