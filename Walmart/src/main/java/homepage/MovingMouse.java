package homepage;

import common.CommonAPI;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MovingMouse extends CommonAPI {

    public void movemouse() throws InterruptedException {
        clickByXpath("//button[@class='f_a al_c f_c']//span[@class='g_a g_h']");
        sleepFor(2);
        WebElement element = driver.findElement(By.xpath("//div[@id='header-spark-menu']//button[3]"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        sleepFor(2);


    }

}
