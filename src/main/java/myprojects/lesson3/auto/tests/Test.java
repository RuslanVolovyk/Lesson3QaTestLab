package myprojects.lesson3.auto.tests;

import myprojects.lesson3.auto.BaseTest;
import myprojects.lesson3.auto.pages.Catalog;
import myprojects.lesson3.auto.pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * Created by Администратор on 10.03.2018.
 */
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

//        LogOut logOut = new LogOut(driver);
//        logOut.logOutImage();
//        logOut.logOut();
//
//        quitDriver(driver);
    }
}
