package com.rtb.Pages;

import com.rtb.Settings.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VisitPage extends Base {
//    WebDriver driver;
    public VisitPage(WebDriver driver){this.driver = driver; }

    By clickEnterStoreLocator = By.xpath("//*[@id=\"open-me\"]/a");
    By clickEnterButtonLocator = By.cssSelector("#login_form > div > input.action_button.sign_up");
    By inputPassLocator = By.cssSelector("#password");



    public void enterPass() {
        chromedriver.findElement(clickEnterStoreLocator).click();
    }

    public void inputPass () {
        driver.findElement(inputPassLocator).sendKeys("paigaw");
    }

    public void clickEnterButton() {
        driver.findElement(clickEnterButtonLocator).click();
    }
    public void enterStore() {
        enterPass();
        inputPass();
        clickEnterButton();
    }
}
