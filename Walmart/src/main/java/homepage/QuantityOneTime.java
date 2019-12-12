package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;

public class QuantityOneTime extends CommonAPI {
    public void increasevalue () throws InterruptedException {
        typeByXpath("//input[@id='global-search-input']", "toy boat");
        clickByXpath("//button[@id='global-search-submit']");
        clickByXpath("//div[@id='searchProductResult']/ul/li[3]//a[@title='Electric Rescue " +
                "Ship Fire Boat Water Squirts Light Music Baby Children Kid Toy']/span");
        clickByXpath("//select[contains(@placeholder,'Qty:')]");
        sleepFor(1);
clickByXpath("//option[contains(text(),'8')]");
    }

    }
