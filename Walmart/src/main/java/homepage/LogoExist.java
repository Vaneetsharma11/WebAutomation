package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;

public class LogoExist extends CommonAPI {

    public void valuevisible () {
        System.out.println(driver.findElement(By.xpath("//a[@id='vh-home-link']//span[@class='g_a g_i']")).isDisplayed());
    }
}
