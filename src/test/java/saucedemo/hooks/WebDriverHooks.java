package saucedemo.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebDriver;

public class WebDriverHooks {
    @Managed(uniqueSession = true)
    WebDriver driver;


    @Before(order = 0)
    public void setUp(Scenario scenario) {
        Serenity.recordReportData().withTitle("Escenario").andContents(scenario.getName());
    }

    @After(order = 1)
    public void tearDown(Scenario scenario) {
        try { driver.manage().deleteAllCookies(); } catch (Exception ignored) {}
        Serenity.recordReportData().withTitle("Resultado").andContents(scenario.getStatus().name());
    }
}
