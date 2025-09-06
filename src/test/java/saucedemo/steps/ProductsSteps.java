package saucedemo.steps;

import net.serenitybdd.annotations.Step;
import saucedemo.pages.ProductsPage;

public class ProductsSteps {

    // Serenity inyecta el PageObject
    private ProductsPage productsPage;

    @Step("Agregar producto '{0}' al carrito")
    public void agregarProducto(String productName) {
        // addButtonFor(...) ya hace waitUntilClickable() en ProductsPage
        productsPage.addButtonFor(productName).click();
    }

    @Step("Ir al carrito")
    public void irAlCarrito() {
        // Aquí sí esperamos porque cartIcon() no aplica wait en el getter
        productsPage.cartIcon()
                .waitUntilClickable()
                .click();
    }
}
