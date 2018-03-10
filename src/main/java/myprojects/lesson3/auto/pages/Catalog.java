package myprojects.lesson3.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Администратор on 10.03.2018.
 */
public class Catalog {
    private By catalog = By.id("subtab-AdminCatalog");
    public static EventFiringWebDriver driver;

    public Catalog(EventFiringWebDriver driver) {
        this.driver = driver;
    }

    public void openCatalogCategory() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(catalog));

        WebElement catalogTabElements = driver.findElement(catalog);
        Actions actions = new Actions(driver);
        actions.moveToElement(catalogTabElements).build().perform();
        catalogTabElements.findElements(By.cssSelector("li")).get(1).click();

    }
}
