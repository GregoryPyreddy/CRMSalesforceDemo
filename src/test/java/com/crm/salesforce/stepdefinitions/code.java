package com.crm.salesforce.stepdefinitions;


import com.crm.salesforce.utility.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class code extends TestBase {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/akupa/Downloads/drivers/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://login.salesforce.com/");
Thread.sleep(5000);
     driver.findElement(By.xpath("//input[@name='username")).sendKeys("bb67@bb2.com");
     Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='password")).sendKeys("bugb1234");

        driver.findElement(By.xpath("//input[@name='Login")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'My Accounts")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//table[@id=\"vodResultSet\"]/tbody/tr[contains(@class,\"dataRow even\")]/td[2]/a[contains(text(),'Adams, Bob')]")).click();
    }
}
