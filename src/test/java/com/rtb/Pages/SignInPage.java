package com.rtb.Pages;

import com.rtb.Settings.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends Base {

    private WebDriver driver;

    public SignInPage(WebDriver driver){this.driver = driver; }

    By pageTitlelocator = By.cssSelector(".column_right > h1:nth-child(1)");

    public  void assertSignInPageTitle(){
        Assert.assertEquals("Page didn't open", driver.findElement(pageTitlelocator).getText(), "Sign in to Goodreads");
        System.out.println("*Sign in page is opened_TEST_OK*");
    }
}
