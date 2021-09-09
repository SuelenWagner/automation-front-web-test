package pageSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageBase.SearchPage;
import utils.WebDriverUtil;

public class SearchSteps {

    WebDriver driver = WebDriverUtil.openBrowser();
    SearchPage page;

    @Given("que o usuario acessa o site da Getnet")
    public void queOUsuarioAcessaOSiteDaGetnet() {
        page = new SearchPage(driver);
        this.page.accessHelpCenter();
    }
    @When("pesquisa por {string}")
    public void pesquisaPor(String productName) {
        this.page.searchProduct(productName);
    }
    @When("seleciona a opcao para verificar a conta SuperGet")
    public void selecionaAOpcaoParaVerificarAContaSuperGet() {
        this.page.accessMoreInformationOption();
        this.page.accessModalHowToAccessMySupergetAccount();
    }
    @Then("deve apresentar na tela a modal contendo {string}")
    public void deveApresentarNaTelaAModalContendo(String labelSupergetAccount) {
        this.page.validateModalHowToAccessMySupergetAccount(labelSupergetAccount);
    }

    @When("pesquiso por {string}")
    public void pesquisoPor(String productName) {
        this.page.searchProduct(productName);
    }
    @Then("deve apresentar na tela a mensagem no resultado da pesquisa {string}")
    public void deveApresentarNaTelaAMensagemNoResultadoDaPesquisa(String messageNoResultsSearch) {
        this.page.validateMessageNoResultsSearch(messageNoResultsSearch);
    }
}
