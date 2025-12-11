package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

import static browser.Config.BROWSER_TYPE;
import static browser.Config.WAIT;

public class Browser {
    public static WebDriver driver;

    public static WebDriver createDriver(){
        switch (BROWSER_TYPE){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                System.out.println("Некорректное имя браузера: " + BROWSER_TYPE);
        }
        driver.manage().window().maximize();
        //браузер будет ждать появление всех элементов до 30 секунд, если загрузятся раньше, то шаги будут выполняться дальше
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT));
        return driver;
    }
}
