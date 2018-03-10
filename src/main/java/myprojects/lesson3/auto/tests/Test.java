package myprojects.lesson3.auto.tests;

import myprojects.lesson3.auto.BaseTest;
import myprojects.lesson3.auto.pages.Login;
import org.openqa.selenium.WebDriver;

/**
 * Created by Администратор on 10.03.2018.
 */
public class Test extends BaseTest {

    public static void main(String[] args) {
        System.out.println("==Start Test==");
        WebDriver driver = getWebdraiver();

        Login login = new Login(driver);
        login.open();
        login.inputLogin();
        login.inputPassword();
        login.signIn();

        //quitDriver(driver);
    }
}
