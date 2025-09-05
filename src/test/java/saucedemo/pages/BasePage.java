package saucedemo.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;


public abstract class BasePage extends PageObject {


    protected void click(WebElementFacade element) {
        element.waitUntilClickable().click();
    }


    protected void type(WebElementFacade element, String text) {
        element.waitUntilVisible().clear();
        element.type(text);
    }


    protected WebElementFacade $by(By locator) {
        return $(locator).waitUntilVisible();
    }
}