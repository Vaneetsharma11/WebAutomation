package homepage;

import common.CommonAPI;

public class LocalStore extends CommonAPI {
    public void locationvalue(){
        clickByXpath("//span[contains(text(),'Stores')]");
        clickByXpath("//div[contains(text(),'Local Store')]");
    }
}
