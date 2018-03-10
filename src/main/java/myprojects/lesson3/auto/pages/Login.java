package myprojects.lesson3.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import myprojects.lesson3.auto.utils.Properties;
import org.openqa.selenium.WebElement;

/**
 * Created by Администратор on 10.03.2018.
 */
public class Login {
    private static final String LOGIN = "webinar.test@gmail.com";
    private static final String PASSWORD = "Xcg7299bnSmMuRLp9ITw";
    static WebDriver driver;
    private By login = By.id("email");
    private By password = By.id("passwd");
    private By signIn = By.name("submitLogin");


    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(Properties.getBaseAdminUrl());
    }

    public void inputLogin() {
        driver.findElement(login).sendKeys(LOGIN);
    }

    public void inputPassword() {
        driver.findElement(password).sendKeys(PASSWORD);
    }

    public void signIn() {
        driver.findElement(signIn).click();
    }
}
