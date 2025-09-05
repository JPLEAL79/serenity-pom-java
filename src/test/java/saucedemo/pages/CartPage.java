package saucedemo.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class CartPage extends BasePage {

    // Item del carrito por nombre (getter dinámico)
    public WebElementFacade cartItemByName(String productName) {
        By locator = By.xpath(
                "//div[@class='cart_item']//div[@class='inventory_item_name' and text()='" + productName + "']"
        );
        return $by(locator);
    }
}
