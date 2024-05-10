package bdd.page;
import bdd.webdriver.DOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class compra extends DOM {
    @FindBy(xpath="//*[@id=\"home-page__button-cookies-confirm\"]")
    protected WebElement btnradio;
    public void esperaco(){espera(btnradio);}
    public void clickco(){onclick(btnradio);}
}
