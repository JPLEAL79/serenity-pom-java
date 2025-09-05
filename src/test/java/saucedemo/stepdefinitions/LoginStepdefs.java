package saucedemo.stepdefinitions;

import io.cucumber.java.en.Given;   // usa EN porque tu feature usa Given/When/Then
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import saucedemo.steps.LoginSteps;   // o AuthSteps si así lo renombraste

public class LoginStepdefs {

    @Steps
    LoginSteps login;

    @Given("que el usuario abre la aplicación")
    public void abrirApp() {
        login.abrirAplicacion();
    }

    @When("se autentica con usuario {string} y password {string}")
    public void autenticar(String user, String pass) {
        login.autenticar(user, pass);
    }

    // POSITIVO
    @Then("el login debería ser exitoso")
    public void validarLoginOk() {
        login.validarLoginExitoso();
    }

    // NEGATIVO
    @Then("debería ver el mensaje de error {string}")
    public void validarError(String esperado) {
        login.validarError(esperado);
    }
}
