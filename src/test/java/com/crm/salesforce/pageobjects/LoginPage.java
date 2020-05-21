package com.crm.salesforce.pageobjects;

import com.crm.salesforce.utility.CommonUtils;
import com.crm.salesforce.utility.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends TestBase {

    //Page Factory -Object Repository
    @FindBy(xpath="//input[@name='username']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='Login']")
    private WebElement loginButton;
    
    @FindBy(xpath = "//span[@id='userNavLabel']")
    private WebElement linkUser;
    
    @FindBy(xpath = "//a[@title='Logout']")
    private WebElement linkLogout;

    //Initializing the Page Objects
    public LoginPage() throws InterruptedException {
        PageFactory.initElements(driver, this);
    }

    //Actions on the page
    public HomePage login(String un, String pwd) throws InterruptedException {
       username.sendKeys(un);
        password.sendKeys(pwd);
        loginButton.click();

        return new HomePage();

    }

    public String validateLoginPage(){
        return driver.getCurrentUrl();
    }
    
    public void logout() {
    	linkUser.click();
    	CommonUtils.waitForClickable(linkLogout);
    	linkLogout.click();
    }

}
