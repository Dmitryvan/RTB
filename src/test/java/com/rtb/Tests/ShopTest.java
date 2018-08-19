package com.rtb.Tests;

import com.rtb.Settings.Base;
import org.junit.Test;


public class ShopTest extends Base {

    //Shop page opening
    @Test
    public void collection() throws InterruptedException{
        LoginTest logintest = new LoginTest();
        logintest.login();
        HomePage homepage = new HomePage(driver);
        homepage.clickShop();
        homepage.clickLabel();
//        опустить страницу вниз
    }
}
