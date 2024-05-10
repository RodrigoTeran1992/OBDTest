package bdd.step;
import bdd.page.compra;

public class comprastep {
    public compra com() {
        return new compra();
    }
    public void esperacostep(){com().esperaco();}
    public void clickcostep(){com().clickco();}
}