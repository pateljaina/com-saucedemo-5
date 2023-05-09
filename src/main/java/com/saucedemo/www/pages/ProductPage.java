package com.saucedemo.www.pages;

import com.aventstack.extentreports.Status;
import com.saucedemo.www.customlisteners.CustomListeners;
import com.saucedemo.www.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ProductPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Products')]")
    WebElement productsText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='']")
    WebElement list;
    public String getProductsText() {
        CustomListeners.test.log(Status.PASS,"Get Products Text");
        Reporter.log("Get Products Text" + productsText.toString());
        return getTextFromElement(productsText);
    }

    public String getItemNumberOnProductsPage() {
        CustomListeners.test.log(Status.PASS,"Get Item NUmber On Products Page");
        Reporter.log("Get Item NUmber On Products Page" + list.toString());
        return getTextFromElement(list);
    }
    }

