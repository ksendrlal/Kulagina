package pages;

import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public WebFormPage openForm(){
        return new WebFormPage(driver);
    }


}
