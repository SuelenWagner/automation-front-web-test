package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class WebDriverUtil {

    private static WebDriver driver;

    public static WebDriver openBrowser() {
        System.setProperty("webdriver.chrome.driver", getPathChromeDriver());
        driver = new ChromeDriver(addOptions());
        driver.manage().window().maximize();
        driver.get("https://site.getnet.com.br/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Entrou no abrir browser");
        return driver;
    }

    public static void quitBrowser() {
        if(driver!=null) {
            driver.quit();
            driver=null;
        }
    }

    static String getPathChromeDriver(){
        String so = System.getProperty("os.name").toLowerCase();
        so = so.replaceAll(" ", "");
        so = so.replaceAll("[0-9]", "");
        String directory = System.getProperty("user.dir");

        if("windows".equals(so)){
            return directory + "/drivers/windows/chromedriver.exe";
        } else {
            //Foi trocado ${s} pelo .format %s
            return directory + String.format("/drivers/%s/chromedriver",so);
        }
    }

    static ChromeOptions addOptions(){
        String so = System.getProperty("os.name").toLowerCase();
        so = so.replaceAll(" ", "");
        so = so.replaceAll("[0-9]", "");
        ChromeOptions options = new ChromeOptions();

        if("linux".equals(so)){
            options.addArguments("--no-sandbox");
        }

        return options;
    }
}
