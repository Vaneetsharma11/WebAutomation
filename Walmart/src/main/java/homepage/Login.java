package homepage;

import common.CommonAPI;
import org.junit.Test;
import org.openqa.selenium.By;

public class Login extends CommonAPI {

        public void loginvalue () throws InterruptedException {
                sleepFor(2);
                clickByXpath("/html//button[@id='header-account-toggle']//span[.='Account']");
clickByXpath("//div[contains(text(),'Sign In')]");
typeByXpath("//input[@id='email']","vaneet11webs@gmail.com");
typeByXpath("//input[@id='password']","12345");
clickByXpath("//button[@class='button m-margin-top']");
        }

}