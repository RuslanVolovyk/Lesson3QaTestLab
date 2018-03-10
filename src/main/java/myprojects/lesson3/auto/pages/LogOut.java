package myprojects.lesson3.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class LogOut {
    private static EventFiringWebDriver driver;
    private By pictogramma = By.className("employee_avatar_small");
    private By logOut = By.id("header_logout");


    public LogOut(EventFiringWebDriver driver) {
        this.driver = driver;
    }
    public void logOutImage() {
        driver.findElement(pictogramma).click();
    }

    public void logOut() {
        driver.findElement(logOut).click();
    }
}

