package Marks_and_Spencer.Test;

import Marks_and_Spencer.Pages.PageFactory;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    protected static PageFactory pageFactory;
    static WebDriver driver;

    @BeforeClass
    public static void signInAndUrlVerification() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://www.marksandspencer.com/");
        pageFactory = new PageFactory(driver);
    }

    @AfterClass
    public static void close() {
        driver.close();
    }

}
