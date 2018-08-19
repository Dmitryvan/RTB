package com.rtb.Settings;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Base {

    protected static WebDriver driver;

    protected static String userName = "Dima";
    protected static String userEmail = "van777dim@gmail.com";
    protected static String userPassword = "0679982026Dfyby";

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.goodreads.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

//    @After
//    public void tearDown(){
//        driver.close();
//    }
}
