package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPo extends Base{
    public ProductPo(WebDriver driver) {
        super(driver);
    }
    By addtocartbutton = By.id("add-to-cart-button");

public void addtocart(){click(addtocartbutton);}


}


