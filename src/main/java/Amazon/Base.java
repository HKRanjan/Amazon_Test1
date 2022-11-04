package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class Base {
    public WebDriver driver;
    public WebDriverWait wait;


    public Base(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void waitForElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void click(By locator) {
        waitForElement(locator);
        driver.findElement(locator).click();
    }

    public void sendKeys(By locator, String text) {
        waitForElement(locator);
        driver.findElement(locator).sendKeys(text);
    }

    public void switchwindow() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        Set<String> childwindow = driver.getWindowHandles();
        Iterator<String> itr = childwindow.iterator();
        while (itr.hasNext()) {
            String targetwindow = itr.next();
            driver.switchTo().window(targetwindow);
        }

    }
}


