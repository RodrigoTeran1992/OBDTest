package bdd.step;
import bdd.page.navegador;
public class Navstep {
    public navegador logins(){return new navegador();}
    public void stepIniciarNavegador(String url) {
        logins().iniciarNavegador(url);
    }
    public void  inuser(String user){logins().inuser(user);}
    public void inpass(String password){logins().inpass(password);}
    public void btnlogin(){logins().btlogin();}
    public void esperalogin(){logins().esperLogin();}

}
