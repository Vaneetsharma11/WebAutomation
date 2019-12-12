package homepage;

import common.CommonAPI;
import org.junit.Test;

public class AddtoCart extends CommonAPI {

public void valuegoaddtocart(){

    typeByXpath("//input[@id='global-search-input']","mirror");
    clickByXpath("//button[@id='global-search-submit']");
    clickByXpath("//li[2]//div[1]//div[2]//div[2]//div[1]//div[1]//a[1]//img[1]");
    clickByXpath("//span[@class='spin-button-children']");
}
    }
