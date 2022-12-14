package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","D:\\Software test program\\Automaton Testing\\chromedriver_win32\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterClass
    public void tearDown()
    {
        driver.close();
        driver.quit();
    }

}
