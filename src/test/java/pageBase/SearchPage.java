package pageBase;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.SearchObjects;
import utils.BasicConfiguration;

public class SearchPage extends BasicConfiguration {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    SearchObjects pageObjects = new SearchObjects(driver);

    public SearchPage accessHelpCenter() {
        pageObjects.getBtnHelp().click();
        pageObjects.getBtnHelpCenter().click();
        Assert.assertEquals("Getnet", pageObjects.getLabelGetnet().getText());
        waitTo(2);
        return this;
    }

    public SearchPage searchProduct(String productName) {
        pageObjects.getFieldSearch().sendKeys(productName);
        Assert.assertEquals("Está com dúvidas?", pageObjects.getLabelQuestions().getText());
        waitTo(1);
        return this;
    }

    public SearchPage accessMoreInformationOption() {
        pageObjects.getSelectOptionForMoreInformation().click();
        waitTo(2);
        return this;
    }

    public SearchPage accessModalHowToAccessMySupergetAccount() {
        pageObjects.getLinkSupergetAccountInfo().click();
        pageObjects.getBtnCloseSupergetAccountInfo().click();
        pageObjects.getModalHowToAccessMySupergetAccount().click();
        waitTo(1);
        return this;
    }

    public SearchPage validateModalHowToAccessMySupergetAccount(String labelSupergetAccount) {
        Assert.assertEquals(labelSupergetAccount, pageObjects.getLabelHowToAccessMySupergetAccount().getText());
        return this;
    }

    public SearchPage validateMessageNoResultsSearch(String messageNoResultsSearch) {
        Assert.assertEquals(messageNoResultsSearch, pageObjects.getMessageNoResultsSearch().getText());
        return this;
    }
}
