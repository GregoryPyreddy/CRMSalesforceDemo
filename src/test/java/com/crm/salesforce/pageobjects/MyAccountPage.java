package com.crm.salesforce.pageobjects;

import com.crm.salesforce.utility.CommonUtils;
import com.crm.salesforce.utility.TestBase;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccountPage extends TestBase {

	@FindBy(xpath = "//a[text()='Adams, Bob']")
	private WebElement clickTheUserLink;

	@FindBy(xpath = "//input[@value='Record a Call']")
	private List<WebElement> btnRecordACall;

	@FindBy(xpath = "//td[@id='topButtonRow']/descendant::input[@value='Save']")
	private WebElement btnSave;

	@FindBy(xpath = "//h2[text()='New Call Report']")
	private WebElement lblNewCallReport;

	@FindBy(xpath = "//select[@id='RecordTypeId']")
	private WebElement drpdownRecordType;
	
	@FindBy(xpath = "//table[@class='sample-types-table']/descendant::input[@type='text']")
	private WebElement txtQty;
	

	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getDetailingPriority(String value) {
		WebElement elem;
		elem = driver.findElement(By.xpath("//label[contains(text(),'" + value + "')]/../input"));
		return elem;
	}

	public WebElement getSampleAndPromItem(String option) {
		WebElement elem;
		elem = driver.findElement(By.xpath("//label[contains(text(),'"+option+"')]/../input"));
		return elem;
	}
	public WebElement getCallDiscussionItem(int i) {
		WebElement elem;
		elem = driver.findElement(By.xpath("//table[@class='add-discussion-table']/descendant::label[text()='Product']["
				+ i + "]/../following-sibling::div/descendant::select"));
		return elem;
	}

	public void getUserLinkByName() throws InterruptedException {
		Thread.sleep(10000);
		driver.switchTo().frame("itarget");
		clickTheUserLink.click();
		driver.switchTo().defaultContent();

	}

	public void chooseToRecordACall() {
		WebElement elem = btnRecordACall.get(0);
		elem.click();
	}

	public void verifyNewCallPage() {
		CommonUtils.waitForClickable(btnSave);
		Assert.assertTrue(lblNewCallReport.isDisplayed());

	}

	public void selectRecordType(String value) {
		CommonUtils.selectDropDownValue(drpdownRecordType, value);
	}

	public void selectDetailedPriority(List<String> options) {
		for (String opt : options) {
			getDetailingPriority(opt).click();
		}
	}

	public boolean verifyCallDiscussionSection() {
		boolean flag = false;
		for (int i = 1; i <= detailingList.size(); i++) {
			String val = CommonUtils.getDefaultSelectedVal(getCallDiscussionItem(i));
			if(CommonUtils.isStringOrSubStringPresentInList(val, detailingList)) {
				flag = true;
			}
			else {
				return false;
			}
		}
		return flag;
	}
	
	public void choseSampleAndPromOption(String option) {
		getSampleAndPromItem(option).click();
	}
	
	public void enterQuantity(String qty) {
		txtQty.sendKeys(qty);
	}
	
	public void saveCall() {
		btnSave.click();
	}

	public void myAccountPage() {
		PageFactory.initElements(driver, this);
	}

}
