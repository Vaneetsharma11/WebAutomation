package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;

public class AutoSuggestion extends CommonAPI {
public void valueSuggestion() throws InterruptedException {
    clickByXpath("//button[@class='f_a al_c f_c']//span[@class='g_a g_h']");
    clickByXpath("//div[@class='e_a o_a o_o o_g ac_a e_f']//button[1]");
    sleepFor(1);
    clickByXpath("//div[@class='o_a o_l o_b']");
    sleepFor(2);
    clickByXpath("//span[contains(text(),'Sceptre 50\" Class 4K Ultra HD (2160P) LED TV (U515')]");

}
}
