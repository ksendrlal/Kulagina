package webFormPageTest;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.WebFormPage;

import static browser.Config.START_URL;

public class WebFormPageTest {
    private WebDriver driver;
    private MainPage mainPage;
    private WebFormPage webFormPage;
    private String textInput = "Kulagina Ksenia Andreevna";
    private String textArea = "Kulagina Ksenia Andreevna";
    private String password = "123456";


    @BeforeTest
    public void beforeTest(){
        driver = Browser.createDriver();
        mainPage = new MainPage(driver);
        mainPage.openURL(START_URL);
        webFormPage = mainPage.openForm();
    }

    @Test
    public void step_1(){
        Assert.assertTrue(webFormPage.isPageOpen());
    }

    @Test
    public void step_2(){
       webFormPage.setTextInput(textInput);
       webFormPage.setPassword(password);
       webFormPage.setTextArea(textArea);
    }

    public void step_3(){
        webFormPage.setCheckBox("Checked checkbox", true);
        webFormPage.setCheckBox("Default checkbox", true);

    }

    @AfterTest
    public void afterTest(){

    }
}
