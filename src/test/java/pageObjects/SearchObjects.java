package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BasicConfiguration;

public class SearchObjects extends BasicConfiguration {

    public SearchObjects(WebDriver driver) {
        super(driver);
    }

    public WebElement getBtnHelp() {
        expectVisibilityByCssSelector("#u-depth1__item-15214 > a");
        return driver.findElement(By.cssSelector("#u-depth1__item-15214 > a"));
    }

    public WebElement getBtnHelpCenter() {
        expectVisibilityById("u-depth3__item-15218");
        return driver.findElement(By.id("u-depth3__item-15218"));
    }

    public WebElement getLabelGetnet() {
        expectVisibilityByXpath("//span[contains(text(),'Getnet')]");
        return driver.findElement(By.xpath("//span[contains(text(),'Getnet')]"));
    }

    public WebElement getLabelQuestions() {
        expectVisibilityByXpath("//h3[contains(text(),'Está com dúvidas?')]");
        return driver.findElement(By.xpath("//h3[contains(text(),'Está com dúvidas?')]"));
    }

    public WebElement getFieldSearch() {
        expectVisibilityById("faq-search-input");
        return driver.findElement(By.id("faq-search-input"));
    }

    public WebElement getSelectOptionForMoreInformation() {
        expectVisibilityByCssSelector("button > span");
        return driver.findElement(By.cssSelector("button > span"));
    }

    public WebElement getLinkSupergetAccountInfo() {
        expectVisibilityByCssSelector("a:nth-child(10) > h3");
        return driver.findElement(By.cssSelector("a:nth-child(10) > h3"));
    }

    public WebElement getBtnCloseSupergetAccountInfo() {
        expectVisibilityByCssSelector("div.o-modal.is-modal-open > div > div.o-modal__close.o-modal__close-x");
        return driver.findElement(By.cssSelector("div.o-modal.is-modal-open > div > div.o-modal__close.o-modal__close-x"));
    }

    public WebElement getModalHowToAccessMySupergetAccount() {
        expectVisibilityByCssSelector("a:nth-child(7)");
        return driver.findElement(By.cssSelector("a:nth-child(7)"));
    }

    public WebElement getLabelHowToAccessMySupergetAccount() {
        expectVisibilityByCssSelector("div.o-modal.is-modal-open > div > div.o-modal__title");
        return driver.findElement(By.cssSelector("div.o-modal.is-modal-open > div > div.o-modal__title"));
    }

    public WebElement getMessageNoResultsSearch() {
        expectVisibilityByCssSelector("div.c-search-dropdown__response.c-search-response.c-search-response--active > div > p");
        return driver.findElement(By.cssSelector("div.c-search-dropdown__response.c-search-response.c-search-response--active > div > p"));
    }
}
