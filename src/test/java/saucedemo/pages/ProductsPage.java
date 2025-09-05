package saucedemo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {

    @FindBy(css = "div.product_label")           // Título “Products” en /v1
    private WebElementFacade productsTitle;

    @FindBy(css = "a.shopping_cart_link")        // Icono del carrito en el header
    private WebElementFacade cartIcon;

    // --- Getters: exponen elementos sin acciones ---
    public WebElementFacade productsTitle() { return productsTitle; }
    public WebElementFacade cartIcon()      { return cartIcon; }

    // Botón “Add to cart” para un producto por nombre (getter dinámico)
    public WebElementFacade addButtonFor(String productName) {
        By locator = By.xpath(
                "//div[@class='inventory_item_name' and text()='" + productName + "']" +
                        "/ancestor::div[contains(@class,'inventory_item')]//button[contains(@class,'btn_inventory')]"
        );
        return $by(locator); // devuelve WebElementFacade ya con waitUntilVisible()
    }

    // Útil para validación post-login (lo usa LoginSteps)
    public boolean isVisible() {
        return productsTitle.waitUntilVisible().isVisible();
    }
}
