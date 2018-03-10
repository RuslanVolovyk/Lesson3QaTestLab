package myprojects.lesson3.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private By catalog = By.id("subtab-AdminCatalog");
    private By addCategory = By.linkText("Добавить категорию");
    private By inputCategory = By.id("name_1");
    private By saveCategory = By.id("category_form_submit_btn");
    private By filterButton = By.xpath("//*[@id=\"submitFilterButtoncategory\"]");
    private By lastAddCategory = By.xpath("//tbody/tr[last()]//td[3]");
    private By allCategory = By.xpath("//tbody/tr//td[3]");
    private String category = "My Category";
    private static EventFiringWebDriver driver;

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

    public void addCategory() {
        driver.findElement(addCategory).click();
    }

    public void inputCategory() {
        driver.findElement(inputCategory).sendKeys(category);
    }

    public void saveCategory() {
        driver.findElement(saveCategory).click();
    }

    public void clickFilterButton() {
        driver.findElement(filterButton).click();
    }

    public void showAllCategory() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(lastAddCategory, category));
        List<String> categories = new ArrayList<>();
        List<WebElement> elements = driver.findElements(allCategory);
        for (WebElement webElements : elements) {
            categories.add(webElements.getText());
        }
        System.out.println("List of Category: " + categories.toString() + "\n" +
                "The size of list category" + categories.size());

    }

}
