package saucedemo.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://www.saucedemo.com/v1/index.html")
public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElementFacade usernameInput;   // campo usuario

    @FindBy(id = "password")
    private WebElementFacade passwordInput;   // campo password

    @FindBy(id = "login-button")
    private WebElementFacade loginButton;     // botón Login

    @FindBy(css = "h3[data-test='error']")
    private WebElementFacade errorBanner;     // banner de error (si login falla)


    // Getters públicos: exponen los elementos sin duplicar la lógica de click/type
    public WebElementFacade username() {
        return usernameInput;
    }

    public WebElementFacade password() {
        return passwordInput;
    }

    public WebElementFacade loginButton() {
        return loginButton;
    }

    public WebElementFacade error() {
        return errorBanner;
    }
}
