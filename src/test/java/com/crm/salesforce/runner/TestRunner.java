package com.crm.salesforce.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.crm.salesforce.utility.TestBase;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/test.feature"
        ,glue={"com/crm/salesforce/stepdefinitions"}
        ,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
//        	{"pretty","html:target/html-report","json:target/cucumber.json"}

)

public class TestRunner extends TestBase {
	public static String filesep = System.getProperty("file.separator");
	@AfterClass
    public static void writeExtentReport() {
		String path= System.getProperty("user.dir")+filesep;
        Reporter.loadXMLConfig(path+"extent-config.xml");
        driver.quit();
    }
}
