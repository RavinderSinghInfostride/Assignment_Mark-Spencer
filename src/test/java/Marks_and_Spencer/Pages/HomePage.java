package Marks_and_Spencer.Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    WebDriver driver;
    By signInLink = By.xpath("//a[contains(@class,'navigation-res-nav-header__login-link')]");
    By subMenuOptionSelect = By.xpath("(//li/a[contains(text(),'View All')])[1]");
    String menuOption = "Women";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void menuOptionSelectAndPageVerify() {
        WebElement ele = driver.findElement(By.xpath(String.format("//ul[@class='nav-primary__list']//li//a[(contains(@class,'nav-primary__menu-link')) and (contains(text(),'%s'))]", menuOption)));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).perform();
        driver.findElement(subMenuOptionSelect).click();
        String actual = driver.findElement(By.xpath("//div//h1")).getText();
        Assert.isTrue(actual.equals("Women’s New In"), "Expected result does not match with actual result");
    }

    public void signInLinkClickAndPageVerify(String verifyText) {
        driver.findElement(signInLink).click();
        String actual = driver.findElement(By.xpath("//div//h1[contains(text(),'Sign In')]")).getText();
        Assert.isTrue(actual.equals(verifyText), "Expected result does not match with actual result");
    }
}
