package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public static String LOGIN_URL = BASE_URL+"login";
    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "username") private WebElement usernameInput;
    @FindBy(id = "password") private WebElement passwordInput;
    @FindBy(tagName = "button") private WebElement loginButton;

    public void enterUsername(String username){
        usernameInput.sendKeys(username);
    }
    public void enterPassword(String password){
        passwordInput.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }
}
