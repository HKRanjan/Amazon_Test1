package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonhomePo extends Base{

    public AmazonhomePo(WebDriver driver) {
        super(driver);
    }
    public String home = driver.getWindowHandle();
    By searchbox = By.id("twotabsearchtextbox");
    By laptopbag = By.xpath("//div[@aria-label=\"laptop bag\"]");
    By product = By.xpath("//span[contains(text(),\"Wesley Milestone 2.0 15.6 inch 30 L Casual Waterproof Laptop Backpack/Office Bag/School Bag/College Bag/Business Bag/Unisex Travel Backpack (Blue and Black)\")]");

    public void geturl(){
        driver.get("https://www.amazon.in/");
    }
    public void search(){click(searchbox);
        sendKeys(searchbox,"Laptop Bag");}
    public void selectcategory(){
        click(laptopbag);}
    public void selectproduct(){
        click(product);

    }


}
