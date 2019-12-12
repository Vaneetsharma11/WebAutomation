import common.CommonAPI;
import homepage.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homepagetest extends CommonAPI {

    public class LoginTest extends CommonAPI {
        Login login;

        @BeforeMethod
        public void getLogin () {
            login = PageFactory.initElements(driver, Login.class);
        }

        @Test
        public void setLogin () throws InterruptedException {
            login.loginvalue();
        }

        SearchValue searchValue;

        @BeforeMethod
        public void getsearchvalue () {
            searchValue = PageFactory.initElements(driver, SearchValue.class);
        }

        @Test
        public void setSearchValue () {
            searchValue.Searchvalue();
        }

        AddtoCart addtoCart;

        @BeforeMethod
        public void getAddtoCart () {
            addtoCart = PageFactory.initElements(driver, AddtoCart.class);
        }

        @Test
        public void setAddtoCart () throws InterruptedException {
            addtoCart.valuegoaddtocart();
        }

        QuantityOneTime quantityOneTime;

        @BeforeMethod
        public void getQuantity () {
            quantityOneTime = PageFactory.initElements(driver, QuantityOneTime.class);
        }

        @Test
        public void setQuantityOneTime () throws InterruptedException {
            quantityOneTime.increasevalue();
        }

        ProductNavigate productNavigate;

        @BeforeMethod
        public void getProductNavigate () {
            productNavigate = PageFactory.initElements(driver, ProductNavigate.class);
        }

        @Test
        public void setProductNavigate () {
            productNavigate.infoproduct();
        }

        MovingMouse movingMouse;

        @BeforeMethod
        public void getmovingmouse () {
            movingMouse = PageFactory.initElements(driver, MovingMouse.class);
        }

        @Test
        public void setMovingMouse () throws InterruptedException {
            movingMouse.movemouse();
        }

        AutoSuggestion autoSuggestion;

        @BeforeMethod
        public void getAutoSuggestion () {
            autoSuggestion = PageFactory.initElements(driver, AutoSuggestion.class);
        }

        @Test
        public void setAutoSuggestion () throws InterruptedException {
            autoSuggestion.valueSuggestion();
        }

        LogoExist logoExist;

        @BeforeMethod
        public void getLogoExist () {
            logoExist = PageFactory.initElements(driver, LogoExist.class);
        }

       @Test
        public void setLogoExist () {
            logoExist.valuevisible();
        }

        ProductExist productExist;

        @BeforeMethod
        public void getProductExist () {
            productExist = PageFactory.initElements(driver, ProductExist.class);
        }

        @Test
        public void setProductExist () {
            productExist.valuevisible();
        }

        LocalStore localStore;

        @BeforeMethod
        public void getlocalstore () {
            localStore = PageFactory.initElements(driver, LocalStore.class);
        }

        @Test
        public void setLocalStore () {
            localStore.locationvalue();

        }


    }
}




