package com.crm.salesforce.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils extends TestBase {
    public static WebElement getElementByXpath(String xpath) {
        WebElement elem;
        elem = driver.findElement(By.xpath(xpath));
        return elem;
    }
    
    public static void waitForClickable(WebElement elem) {
    	WebDriverWait wait = new WebDriverWait(driver, 20);
    	if(wait.until(ExpectedConditions.elementToBeClickable(elem))==null);
    }
    
    public static void selectDropDownValue(WebElement elem, String value) {
    	Select drpdown = new Select(elem);
//    	List<WebElement>temp = drpdown.getOptions();
    	drpdown.selectByVisibleText(value);
    }
    
    public static String getDefaultSelectedVal(WebElement elem) {
    	Select drpdown = new Select(elem);
    	return drpdown.getFirstSelectedOption().getText();
    }
    
    public static boolean isStringOrSubStringPresentInList(String str, List<String> list) {
    	boolean flag = false;
    	for(String val : list) {
    		if(str.contains(val)) {
    			flag=true;
    		}
    	}
    	return flag;
    }
}
