package homepage;

import common.CommonAPI;

public class ProductNavigate extends CommonAPI {
    public void infoproduct(){
   typeByXpath("//input[@id='global-search-input']","fake grass");
   clickByXpath("//button[@id='global-search-submit']");
   clickByXpath("//div[@id='searchProductResult']/ul/li[2]//a[@title='AllGreen Chenille Deluxe 6 x 9 ft Multi Purpose Artificial" +
           " Grass Synthetic Turf Indoor/Outdoor Doormat/Area Rug Carpet']/span");
        System.out.println( getTextByXpath("//div[@class='prod-ProductHighlights-description xs-margin-top']"));

    }
}
