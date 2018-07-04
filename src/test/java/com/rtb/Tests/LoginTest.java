package com.rtb.Tests;

import com.rtb.Pages.HomePage;
import com.rtb.Settings.Base;
import org.junit.Test;

public class LoginTest extends Base {

    //login
    @Test
    public void login() throws InterruptedException {
        HomePage homepage = new HomePage(driver);
        homepage.clickSignIn();
    }
}
