package com.rtb.Pages;

import com.rtb.Settings.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base {

    private WebDriver driver;

    public LoginPage (WebDriver driver){this.driver = driver; }

    By inputNameLocator = By.id("user_first_name");
    By inputEmailLocator = By.id("user_email");
    By inputPasswordLocator = By.id("user_password_signup");
    By clickLoginButtonLocator = By.cssSelector(".button");


    public void inputName(String email){
        WebElement login = driver.findElement(inputNameLocator);
        login.click();
        login.sendKeys(email);

    public void inputEmail(String email){
        WebElement login = driver.findElement(inputEmailLocator);
        login.click();
        login.sendKeys(email);
    }

    public void inputPassword(String password){
        WebElement login = driver.findElement(inputPasswordLocator);
        login.click();
        login.sendKeys(password);
    }

    public void clickLoginButton (){
        driver.findElement(clickLoginButtonLocator).click();
    }

    //Login fields are filling and click SIGN IN button
    public void loginSite (String userEmail, String userPassword) {
        inputName(userName);
        inputEmail(userEmail);
        inputPassword(userPassword);
        clickLoginButton();
    }
}

