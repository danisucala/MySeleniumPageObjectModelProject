package com.herokuapp.tests;

import com.herokuapp.pages.LoginPage;
import com.herokuapp.pages.SecureAreaPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.herokuapp.pages.LoginPage.LOGIN_URL;

public class LoginTest extends BaseTest{
    @Test
    public void loginTest(){

        //open page
        driver.get(LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername ("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        waitForNumberOfSeconds(2);
        loginPage.clickLoginButton();
        SecureAreaPage secureAreapage = new SecureAreaPage(driver);
        Assert.assertTrue(secureAreapage.checkIfSuccessAlertIsPresent());
        Assert.assertTrue(secureAreapage.getAlertText().contains("You logged into a secure area!"));

    }
}
