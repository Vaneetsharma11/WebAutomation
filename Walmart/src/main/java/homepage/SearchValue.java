package homepage;

import common.CommonAPI;

public class SearchValue extends CommonAPI {
    public void Searchvalue(){
        typeByXpath("//input[@id='global-search-input']", "moter car");
        clickByXpath("//button[@id='global-search-submit']");
         clickByXpath("//span[contains(text(),'Power Wheels 12V Dune Racer Extreme - Green/Pink/P')]");

    }
}
