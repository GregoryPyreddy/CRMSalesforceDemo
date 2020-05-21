package com.crm.salesforce.stepdefinitions;

import java.util.List;

import org.junit.Assert;

import com.crm.salesforce.pageobjects.MyAccountPage;
import com.crm.salesforce.utility.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyAccountSteps extends TestBase {

	MyAccountPage accountp = new MyAccountPage();

	@And("^user is on My Account page$")
	public void userIsOnMyAccountPage() {

	}

	@When("^user selects \"([^\"]*)\" from My Accounts list$")
	public void selectsFromMyAccountsList(String arg0) throws InterruptedException {
		accountp.getUserLinkByName();

	}

	@When("^user chooses to record a call$")
	public void user_chooses_to_record_a_call() throws Throwable {
		accountp.chooseToRecordACall();
	}

	@When("^user select \"([^\"]*)\" from the Record Type drop down list$")
	public void user_select_from_the_Record_Type_drop_down_list(String value) throws Throwable {
		accountp.selectRecordType(value);
	}

	@Then("^Verify the new call page is displayed$")
	public void verify_the_new_call_page_is_displayed() throws Throwable {
		accountp.verifyNewCallPage();
	}

	@When("^user selects following options under Detailing Priority$")
	public void theFollowingKeywordsAreHere(List<String> data) {
		detailingList = data;
		accountp.selectDetailedPriority(data);
	}

	@Then("^user verifies above mentioned options under Call discussion section$")
	public void verifies_options_under_Call_discussion() throws Throwable {
		Assert.assertTrue(accountp.verifyCallDiscussionSection());
	}

	@When("^user selects the check box \"([^\"]*)\" and change quantity to \"([^\"]*)\"$")
	public void user_selects_the_check_box_and_change_quantity_to(String option, String qty) throws Throwable {
		accountp.choseSampleAndPromOption(option);
		accountp.enterQuantity(qty);
	}

	@When("^user clicks on save button$")
	public void user_clicks_on_save_button() throws Throwable {
		accountp.saveCall();
	}

}
