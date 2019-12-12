package homepage;


import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragNDrop extends CommonAPI {

    public static void main (String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/vaneetsharma/Downloads/Homedepot1-master/Generic/src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@id='draggable']")).click();
        WebElement dragme = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropme = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions action = new Actions(driver);
        action.dragAndDrop(dragme, dropme).perform();

    }
}









