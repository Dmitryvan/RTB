package com.rtb.Tests;

import com.rtb.Pages.HomePage;
import com.rtb.Pages.VisitPage;
import com.rtb.Settings.Base;
import org.junit.Test;

public class LoginTest extends Base {

    //login
    @Test
    public void login() throws InterruptedException {
        VisitPage visitpage = new VisitPage(driver);
        visitpage.enterStore();
        HomePage homepage = new HomePage(driver);
        homepage.clickSignIn();
    }
}
