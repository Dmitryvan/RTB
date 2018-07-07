package com.rtb.Settings;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Base {

   protected WebDriver driver;
   public static WebDriver chromedriver;

    @Before
    public void setUp() {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver chromedriver =new ChromeDriver(capabilities);
        chromedriver.get("https://relaxtheback-com.myshopify.com");

//      driver = new ChromeDriver();
//      driver.get("https://relaxtheback-com.myshopify.com");
        chromedriver.manage().window().maximize();
        chromedriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

//    @After
//    public void tearDown(){
//        chromedriver.close();
//    }
}
