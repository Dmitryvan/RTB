package com.rtb.Tests;

import com.rtb.Pages.LoginPage;
import com.rtb.Settings.Base;
import org.junit.Test;


public class LoginTest extends Base {

    //Login on Development
    @Test
    public void login()  {
        VisitPage visitpage = new VisitPage(driver);
        visitpage.enterStore();
        HomePage homepage = new HomePage(driver);
        homepage.clickMyAccount();
        LoginPage loginpage = new LoginPage(driver);
        loginpage.loginSite(userEmail, userPassword);
    }

//    @Test //Check text elements on the page



}
