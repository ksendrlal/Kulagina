package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class WebFormPage extends BasePage {
    public WebFormPage(WebDriver driver) {
        super(driver);
    }

    public By header = By.xpath("//h1[text()='Web form']");
    public By textInputLocator = By.xpath("//input[@name='my-text']");
    public By textAreaLocator = By.xpath("//textarea[@name='my-textarea']");
    public By passwordLocator = By.xpath("//input[@name='my-password']");
    //public static final String checked = "checked";

    public static final String CHECK_BOX_INPUT_XPATH = "//input[@type='checkbox'][following-sibling::text()[contains(., '%s')]]";


    public boolean isPageOpen(){
        return driver.findElement(header).isDisplayed();
    }


    public void setTextInput(String textInput){
        driver.findElement(textInputLocator).click();
        driver.findElement(textInputLocator).sendKeys(textInput);
    }

    public void setTextArea(String textArea){
        driver.findElement(textAreaLocator).click();
        driver.findElement(textAreaLocator).sendKeys(textArea);
    }

    public void setPassword(String password){
        driver.findElement(passwordLocator).click();
        driver.findElement(passwordLocator).sendKeys(password);
    }

    /*
    public void setAllField(String textInput, String password, String textArea){
        setTextInput(textInput);
        setPassword(password);
        setTextArea(textArea);
    } */

    public boolean getCheckBoxState(String checkBoxName){
        return driver.findElement(By.xpath(String.format(CHECK_BOX_INPUT_XPATH, checkBoxName))).isSelected();
    }

    public void setCheckBox(String checkBoxName, boolean state){
        if (!getCheckBoxState(checkBoxName)==state){
            driver.findElement(By.xpath(String.format(CHECK_BOX_INPUT_XPATH, checkBoxName))).click();
        }
    }



}
