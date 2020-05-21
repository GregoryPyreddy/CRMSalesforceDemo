package com.crm.salesforce.pageobjects;

import com.crm.salesforce.utility.TestBase;
import org.openqa.selenium.support.PageFactory;

public class UserAccountPage extends TestBase {

    public UserAccountPage(){
        PageFactory.initElements(driver, this);
    }



}
