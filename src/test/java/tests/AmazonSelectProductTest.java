package tests;

import Amazon.AmazonhomePo;
import Amazon.ProductPo;
import org.testng.annotations.Test;

public class AmazonSelectProductTest extends BaseTest{

    @Test
    public void selectbag() throws InterruptedException {
        AmazonhomePo obj = new AmazonhomePo(driver);
        obj.geturl();
        obj.search();
        Thread.sleep(2000);
        obj.selectcategory();
        obj.selectproduct();

    }
    @Test(dependsOnMethods = "selectbag")
    public void addtocart(){
        ProductPo obj1 = new ProductPo(driver);
        obj1.switchwindow();
    if (driver.getTitle().equals("Wesley Milestone 2.0 15.6 inch 30 L Casual Waterproof Laptop Backpack/Office Bag/School Bag/College Bag/Business Bag/Unisex Travel Backpack (Blue and Black) - Buy Wesley Milestone 2.0 15.6 inch 30 L Casual Waterproof Laptop Backpack/Office Bag/School Bag/College Bag/Business Bag/Unisex Travel Backpack (Blue and Black) Online at Low Price in India - Amazon.in"))
    {obj1.addtocart();}
    }
}
