package saucedemo.steps;

import net.serenitybdd.annotations.Step;
import org.assertj.core.api.Assertions;
import saucedemo.pages.LoginPage;
import saucedemo.pages.ProductsPage;

public class LoginSteps {

    private LoginPage loginPage;
    private ProductsPage productsPage;

    @Step("Abrir aplicación (Login)")
    public void abrirAplicacion() {
        // Usa @DefaultUrl definido en LoginPage
        loginPage.open();
    }

    @Step("Autenticarse con usuario '{0}'")
    public void autenticar(String user, String pass) {

        // Interacciones atómicas sobre los elementos expuestos por la Page
        loginPage.username().waitUntilVisible().type(user);
        loginPage.password().waitUntilVisible().type(pass);
        loginPage.loginButton().waitUntilClickable().click();
    }

    @Step("Validar login exitoso")
    public void validarLoginExitoso() {
        Assertions.assertThat(productsPage.isVisible())
                .as("Debería verse la página de productos")
                .isTrue();
    }

    @Step("Validar error: '{0}'")
    public void validarError(String esperado) {
        String actual = loginPage.error().isVisible() ? loginPage.error().getText() : "";
        Assertions.assertThat(actual)
                .as("Mensaje de error en login")
                .containsIgnoringCase(esperado);
    }
}
