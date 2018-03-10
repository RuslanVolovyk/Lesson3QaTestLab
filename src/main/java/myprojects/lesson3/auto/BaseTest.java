package myprojects.lesson3.auto;

import myprojects.lesson3.auto.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Администратор on 10.03.2018.
 */
public abstract class BaseTest {

    public static WebDriver getWebdraiver() {
        WebDriver driver;
        String browser = Properties.getBrowser();
        switch (browser) {
            case "firefox":
                System.setProperty("webdriver.chrome.driver",
                        System.getProperty("user.dir") + "/drivers/chromedriver.exe");
                driver = new FirefoxDriver();
            case "internet explorer":
                System.setProperty("webdriver.chrome.driver",
                        System.getProperty("user.dir") + "/drivers/chromedriver.exe");
                driver = new InternetExplorerDriver();
            case "chrome":
            default:
                System.setProperty("webdriver.chrome.driver",
                        System.getProperty("user.dir") + "/drivers/chromedriver.exe");
                driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        return driver;
    }

    public static void quitDriver(WebDriver driver){
       driver.quit();
    }
}
