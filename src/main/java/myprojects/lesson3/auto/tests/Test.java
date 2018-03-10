package myprojects.lesson3.auto.tests;

import myprojects.lesson3.auto.BaseTest;
import myprojects.lesson3.auto.pages.Catalog;
import myprojects.lesson3.auto.pages.LogOut;
import myprojects.lesson3.auto.pages.Login;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class Test extends BaseTest {

    public static void main(String[] args) {
        System.out.println("==Start Test==");

        EventFiringWebDriver driver = getConfigDriver();

        Login login = new Login(driver);
        login.open();
        login.inputLogin();
        login.inputPassword();
        login.signIn();

        Catalog catalog = new Catalog(driver);
        catalog.openCatalogCategory();
        catalog.addCategory();
        catalog.inputCategory();
        catalog.saveCategory();
        catalog.clickFilterButton();
        catalog.showAllCategory();

        LogOut logOut = new LogOut(driver);
        logOut.logOutImage();
        logOut.logOut();

        quitDriver(driver);
    }
}
