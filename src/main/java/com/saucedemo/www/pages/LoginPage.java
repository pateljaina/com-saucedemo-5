package com.saucedemo.www.pages;

import com.aventstack.extentreports.Status;
import com.saucedemo.www.customlisteners.CustomListeners;
import com.saucedemo.www.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(id = "user-name")
    WebElement usernameField;

    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginLink;

    public void enterUsername(String userName) {
        Reporter.log("Enter Username " + usernameField.toString());
        sendTextToElement(usernameField, userName);
        CustomListeners.test.log(Status.PASS,"Enter Username");
    }



    public void enterPassword(String password) {
        Reporter.log("Enter Password " + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS,"Enter Password");
    }

    public void clickOnLoginLink() {
        Reporter.log("Click On Login Link " + loginLink.toString());
        clickOnElement(loginLink);
    }

}
