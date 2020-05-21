package com.crm.salesforce.stepdefinitions;

import com.crm.salesforce.pageobjects.MyAccountPage;
import com.crm.salesforce.utility.TestBase;
import com.crm.salesforce.pageobjects.HomePage;
import com.crm.salesforce.pageobjects.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomePageSteps extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    MyAccountPage accountsPage;

    public HomePageSteps() throws InterruptedException {
    }
    @Given("^user opens Salesforce Login page$")
    public void userOpensSalesforceLoginPage() throws InterruptedException {
        TestBase.initialization();
        Thread.sleep(5000);
    }

    @When("^user logged in using username as â€œusernameâ€� and password as â€œpasswordâ€�$")
    public void userLoggedInUsingUsernameAsUsernameAndPasswordAsPassword() throws InterruptedException {

    }

    @Then("^user is in Salesforce Homepage$")
    public void userIsInSalesforceHomepage() {
        String str = loginPage.validateLoginPage();
        //title-Salesforce - Enterprise Edition
        Assert.assertEquals("https://na131.salesforce.com/home/home.jsp", str);
    }


    @When("^user enters username and password$")
    public void userEntersUsernameAndPassword() throws InterruptedException {
        loginPage = new LoginPage();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Given("^user clicks on My Accounts tab$")
    public void userClicksOnMyAccountsTab() throws InterruptedException {
        accountsPage = homePage.clickOnMyAccount();
    }
   
    
    @Then("^user logs out of the saleforce application$")
    public void user_logs_out_of_the_saleforce_application() throws Throwable {
        loginPage.logout();
    }


}
