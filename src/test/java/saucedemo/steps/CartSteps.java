package saucedemo.steps;

import net.serenitybdd.annotations.Step;
import org.assertj.core.api.Assertions;
import saucedemo.pages.CartPage;

public class CartSteps {

    private CartPage cartPage;

    @Step("Validar que '{0}' está en el carrito")
    public void validarProductoEnCarrito(String productName) {
        boolean present = cartPage.cartItemByName(productName).isPresent();
        Assertions.assertThat(present)
                .as("El producto debe existir en el carrito")
                .isTrue();
    }
}
