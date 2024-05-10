Feature: OBDTest


  @E2E
  Scenario: test
    Given iniciar navegador "https://release-0-0.d3qrimgg9cswfw.amplifyapp.com/"
    When compra
    Then datos cliente
