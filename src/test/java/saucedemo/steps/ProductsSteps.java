package saucedemo.steps;

import net.serenitybdd.annotations.Step;
import saucedemo.pages.ProductsPage;

public class ProductsSteps {

    // Serenity inyecta el PageObject
    private ProductsPage productsPage;

    @Step("Agregar producto '{0}' al carrito")
    public void agregarProducto(String productName) {
        productsPage.addButtonFor(productName)     // getter dinámico del botón
                .waitUntilClickable()
                .click();
    }

    @Step("Ir al carrito")
    public void irAlCarrito() {
        productsPage.cartIcon()                    // getter del icono
                .waitUntilClickable()
                .click();
    }
}
