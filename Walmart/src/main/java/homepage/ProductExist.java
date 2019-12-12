package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;

public class ProductExist extends CommonAPI {
    public void valuevisible () {
        typeByXpath("//input[@id='global-search-input']", "wodden door");
        clickByXpath("//button[@id='global-search-submit']");
        clickByXpath("//div[@id='searchProductResult']/ul/li[3]//a[@title='MASONITE® BI-FOLD 6-PANEL DOOR, PRIMED WHITE, 24X80 IN.']/span");
        System.out.println(driver.findElement(By.xpath("//h1[@class='prod-ProductTitle font-normal']")).isDisplayed());
    }
}