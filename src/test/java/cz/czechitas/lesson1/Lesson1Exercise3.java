package cz.czechitas.lesson1;

import cz.czechitas.Settings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static java.lang.Thread.sleep;

/*
Cvičení 3:
 - Nav sigujtee v prohlížečí na http://czechitas-shopizer.azurewebsites.net/shop/
 - Uspěte vykonávání na 5 sec

 */
public class Lesson1Exercise3 {

    private static String downloadsPath = Settings.PATH;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", Settings.PATH + "/src/test/resources/drivers/geckodriver");

        FirefoxOptions options = new FirefoxOptions()
                .addArguments("-private")
                .addPreference("browser.download.dir", downloadsPath)
                .addPreference("browser.download.folderList", 2);

        WebDriver driver = new FirefoxDriver(options);

        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.navigate().to("https://czechitas-shopizer.azurewebsites.net/shop");

        Thread.sleep(5000);

        driver.quit();
    }

}