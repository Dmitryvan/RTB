package com.rtb.Pages;

import com.rtb.Settings.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.*;


public class SearchPage extends Base {

    private WebDriver driver;

    public SearchPage(WebDriver driver){this.driver = driver; }

    By wantToReadButtonLocator1 = By.cssSelector("#\\31 _book_34804524 > div:nth-child(1) > form:nth-child(1) > button:nth-child(13)");
    By wantToReadButtonLocator2 = By.cssSelector("#\\32 _book_6271941 > div:nth-child(1) > form:nth-child(1) > button:nth-child(13)");
    By wantToReadButtonLocator3 = By.cssSelector("#\\33 _book_26471006 > div:nth-child(1) > form:nth-child(1) > button:nth-child(13)");

    By dropDownListLocator1 = By.cssSelector("#\\31 _book_34804524 > div:nth-child(2) > button:nth-child(2)");
    By readInDropDownListLocator = By.cssSelector(".wtrExclusiveShelves > li:nth-child(1) > button:nth-child(1)");
    By dropDownListLocator2 = By.xpath("/html/body/div[2]/div[3]/div[1]/div[1]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/button");
    By dropDownListLocator3 = By.cssSelector("#\\33 _book_26471006 > div:nth-child(2) > button:nth-child(2)");
    By saveButtonLocator1 = By.cssSelector("#review_submit_for_34804524");
    By saveButtonLocator2 = By.cssSelector("#review_submit_for_6271941");
    By saveButtonLocator3 = By.cssSelector("#review_submit_for_26471006");

    By rate1Locator1 = By.cssSelector("#\\31 _book_34804524 > div:nth-child(3) > div:nth-child(4) > a:nth-child(1)");
    By rate3Locator3 = By.cssSelector("#\\32 _book_6271941 > div:nth-child(3) > div:nth-child(4) > a:nth-child(3)");
    By rate5Locator5 = By.cssSelector("#\\33 _book_26471006 > div:nth-child(3) > div:nth-child(4) > a:nth-child(5)");
    By reviewLocator1 = By.cssSelector("div.wtrPrompt:nth-child(3) > a:nth-child(1)");
    By reviewLocator2 = By.cssSelector("#\\32 _book_6271941 > div:nth-child(1) > div:nth-child(3) > a:nth-child(1)");
    By reviewLocator3 = By.cssSelector("#\\33 _book_26471006 > div:nth-child(1) > div:nth-child(3) > a:nth-child(1)");

    By reviewFieldLocator = By.id("review_review_usertext");

    public void clickWantToReadButtons123 () throws InterruptedException {
        driver.findElement(wantToReadButtonLocator1).click();
        sleep (1000);
        driver.findElement(wantToReadButtonLocator2).click();
        sleep (1000);
        driver.findElement(wantToReadButtonLocator3).click();
        sleep (1000);
    }

    private void clickRead () {
        driver.findElement(readInDropDownListLocator).click();
    }


    public void clickSaveButtonReadPopUp1 () {
        driver.findElement(saveButtonLocator1).click();
    }
    public void clickSaveButtonReadPopUp2 () {
        driver.findElement(saveButtonLocator2).click();
    }
    public void clickSaveButtonReadPopUp3 () {
        driver.findElement(saveButtonLocator3).click();
    }


    public void markReadInDropDownList1 () {
        driver.findElement(dropDownListLocator1).click();
        clickRead();
        clickSaveButtonReadPopUp1();
    }
    public void markReadInDropDownList2 () {
        driver.findElement(dropDownListLocator2).click();
        clickRead();
        clickSaveButtonReadPopUp2();
    }
    public void markReadInDropDownList3 () {
        driver.findElement(dropDownListLocator3).click();
        clickRead();
        clickSaveButtonReadPopUp3();
    }


    public void clickRate1 () throws InterruptedException {
        WebElement star = driver.findElement(rate1Locator1);
        Actions builder = new Actions(driver);
        sleep (1000);
        builder.moveToElement(star).click().perform();
    }
    public void clickRate3 () throws InterruptedException {
        WebElement star = driver.findElement(rate3Locator3);
        Actions builder = new Actions(driver);
        sleep (1000);
        builder.moveToElement(star).click().perform();
    }
    public void clickRate5 () throws InterruptedException {
        WebElement star = driver.findElement(rate5Locator5);
        Actions builder = new Actions(driver);
        sleep (1000);
        builder.moveToElement(star).click().perform();
    }


    public void setReview1 (String review ) throws InterruptedException {
        sleep (1000);
        WebElement rev = driver.findElement(reviewLocator1);
        rev.click();
        WebElement revfield = driver.findElement(reviewFieldLocator);
        revfield.click();
        revfield.sendKeys(review);
    }
    public void setReview2 (String review ) throws InterruptedException {
        sleep (1000);
        WebElement rev = driver.findElement(reviewLocator2);
        rev.click();
        WebElement revfield = driver.findElement(reviewFieldLocator);
        revfield.click();
        revfield.sendKeys(review);
    }
    public void setReview3 (String review ) throws InterruptedException {
        sleep (1000);
        WebElement rev = driver.findElement(reviewLocator3);
        rev.click();
        WebElement revfield = driver.findElement(reviewFieldLocator);
        revfield.click();
        revfield.sendKeys(review);
    }

}

