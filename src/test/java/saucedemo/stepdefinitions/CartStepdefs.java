package saucedemo.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import saucedemo.steps.LoginSteps;
import saucedemo.steps.ProductsSteps;
import saucedemo.steps.CartSteps;

public class CartStepdefs {

    @Steps
    LoginSteps login;
    @Steps
    ProductsSteps products;
    @Steps
    CartSteps cart;

    @Given("que el usuario ha iniciado sesión con usuario {string} y password {string}")
    public void loginPrecondicion(String user, String pass) {
        login.autenticar(user, pass);
        login.validarLoginExitoso();
    }


    @When("agrega el producto {string}")
    public void agregarProducto(String productName) {
        products.agregarProducto(productName);
    }

    @When("navega al carrito")
    public void irAlCarrito() {
        products.irAlCarrito();
    }

    @Then("debería ver el producto {string} en el carrito")
    public void validarProductoEnCarrito(String productName) {
        cart.validarProductoEnCarrito(productName);
    }

}
