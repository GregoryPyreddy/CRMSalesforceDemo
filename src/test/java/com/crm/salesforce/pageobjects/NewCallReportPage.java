package com.crm.salesforce.pageobjects;

import com.crm.salesforce.utility.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCallReportPage extends TestBase {
    public NewCallReportPage(){
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[contains(text(),'My Accounts')]")
    private WebElement recordACall;

    @FindBy(xpath = "//a[contains(text(),'My Accounts')]")
    private WebElement callReportPage;
    public void clickOnRecordACallButton(){

    }

    public void validateCallReportPageIsDisplayed(){

    }
}
