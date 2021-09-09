package runner;

import io.cucumber.java.After;
import utils.WebDriverUtil;

public class BaseAfter {

    @After
    public void quitBrowser(){
        System.out.println("Entrou no fechar browser ");
        WebDriverUtil.quitBrowser();
    }
}
