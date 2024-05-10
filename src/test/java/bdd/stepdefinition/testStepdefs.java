package bdd.stepdefinition;

import bdd.step.Navstep;
import bdd.step.comprastep;
import bdd.webdriver.DOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testStepdefs {
    private final DOM dom = new DOM();
    private final Navstep navstep = new Navstep();
    private final comprastep com = new comprastep();
    @Given("iniciar navegador {string}")
    public void iniciarNavegador(String url) {
        navstep.stepIniciarNavegador(url);
    }
    @When("compra")
    public void compra() {
        com.esperacostep();
        com.clickcostep();
    }

    @Then("datos cliente")
    public void datosCliente() {
    }
}
