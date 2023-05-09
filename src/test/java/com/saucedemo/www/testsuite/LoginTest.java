package com.saucedemo.www.testsuite;

import com.saucedemo.www.customlisteners.CustomListeners;
import com.saucedemo.www.pages.LoginPage;
import com.saucedemo.www.pages.ProductPage;
import com.saucedemo.www.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginTest extends BaseTest {
    LoginPage loginPage;
    ProductPage productPage;

    @BeforeMethod
    public void setUp(){
        loginPage = new LoginPage();
        productPage = new ProductPage();
    }

    @Test(groups = {"Sanity","Smoke","Regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginLink();
        String expectedMessage = "PRODUCTS";
        String actualMessage = productPage.getProductsText();
        Assert.assertEquals(expectedMessage, actualMessage, "Products Page not displayed");
    }

}
