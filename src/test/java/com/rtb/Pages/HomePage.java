package com.rtb.Pages;

import com.rtb.Settings.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base {

    private WebDriver driver;
    public HomePage(WebDriver driver){this.driver = driver; }

    By signInLocator = By.xpath("//*[@id=\"shopify-section-header\"]/header[2]/div/div[1]/ul[2]/li/a/span");

    public void clickSignIn (){
        driver.findElement(signInLocator).click();
    }

}
