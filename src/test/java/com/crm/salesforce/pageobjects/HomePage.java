package com.crm.salesforce.pageobjects;

import com.crm.salesforce.utility.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath = "//a[contains(text(),'My Accounts')]")
     private WebElement clickMyAccount;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public MyAccountPage clickOnMyAccount() throws InterruptedException {
        clickMyAccount.click();
        return new MyAccountPage();
    }

}


