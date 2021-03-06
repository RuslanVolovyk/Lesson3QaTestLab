package myprojects.lesson3.auto;

import myprojects.lesson3.auto.utils.EventHandler;
import myprojects.lesson3.auto.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;


public abstract class BaseTest {

    public static WebDriver getWebdraiver() {
        WebDriver driver = null;
        String browser = Properties.getBrowser();
        switch (browser) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver",
                        System.getProperty("user.dir") + "/drivers/geckodriver.exe");
                driver = new FirefoxDriver();
            case "iexplore":
                System.setProperty("webdriver.ie.driver",
                        System.getProperty("user.dir") + "/drivers/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            case "chrome":
                System.setProperty("webdriver.chrome.driver",
                        System.getProperty("user.dir") + "/drivers/chromedriver.exe");
                driver = new ChromeDriver();
        }

        return driver;
    }

    public static EventFiringWebDriver getConfigDriver() {
        WebDriver driver = getWebdraiver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
        eventFiringWebDriver.register(new EventHandler());
        return eventFiringWebDriver;
    }

    public static void quitDriver(WebDriver driver) {
        driver.quit();
    }
}
