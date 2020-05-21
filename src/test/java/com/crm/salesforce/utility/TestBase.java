package com.crm.salesforce.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
	public static List<String> detailingList = new ArrayList<String>();
    public static WebDriver driver;
    public static Properties prop;
    public static String fileSep = System.getProperty("file.separator");
    public static String driverDir = System.getProperty("user.dir")+fileSep+"src"+fileSep+"test"+fileSep+"resources"+fileSep;
    public TestBase () {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(driverDir+"browser-config.properties");
            prop.load(fis);
        }
        catch (IOException e){
            e.getMessage();
        }
    }

    public static void initialization(){
        String browserName = prop.getProperty("browser");
        	
        	
            System.setProperty("webdriver.chrome.driver", driverDir+"chromedriver.exe");
            driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));

    }

    public static WebDriver getDriver(){
        return driver;
    }

}
