package runner;




import io.github.bonigarcia.wdm.WebDriverManager;


import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import utils.Drivers;

public class Executar extends Drivers {

    public  void iniciarBrowsers() {

        String navegador = "edge";
        if (navegador.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--disable.gpu");
            chromeOptions.setHeadless(false);
            driver = new ChromeDriver(chromeOptions);

        } else if (navegador.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
             driver = new EdgeDriver();
        }
        action();

    }

}



