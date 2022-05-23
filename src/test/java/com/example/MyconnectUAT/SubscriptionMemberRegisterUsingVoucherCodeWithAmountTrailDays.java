package com.example.MyconnectUAT;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SubscriptionMemberRegisterUsingVoucherCodeWithAmountTrailDays {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "P:\\Myconnect Automation With Selenium\\Myconnect-UAT-Automated\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
  }

  @Test
  public void testRegisterUsingVoucherCodeWithAmountTrailDaysSBMC() throws Exception {
    driver.get("https://connected.uat.myconnect.olivegroup.io/connected");
    driver.findElement(By.linkText("SIGN IN")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Register here")).click();
    driver.findElement(By.id("email")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("pramod.discount0@yopmail.com");
    Thread.sleep(1000);
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("P@ssword34");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='text']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='text']")).clear();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IN2hoejs");
    System.out.println("Amount Trail Days Discount Voucher code has been accepted");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/div/button")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("email")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("Amounttraildays3@yopmail.com");
    Thread.sleep(1000);
    driver.findElement(By.id("cardNumber")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("cardNumber")).clear();
    driver.findElement(By.id("cardNumber")).sendKeys("4242 4242 4242 4242");
    Thread.sleep(1000);
    driver.findElement(By.id("cardExpiry")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("cardExpiry")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("cardExpiry")).sendKeys("05 / 56");
    Thread.sleep(1000);
    driver.findElement(By.id("cardCvc")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("cardCvc")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("cardCvc")).sendKeys("676");
    Thread.sleep(1000);
    driver.findElement(By.id("billingName")).sendKeys("Phanait Chaudhary");
    driver.findElement(By.id("billingCountry")).click();
    driver.findElement(By.xpath("//option[@value='NP']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/div[2]/form/div[2]/div[2]/button/div[3]")).click();
    Thread.sleep(4000);
    driver.findElement(By.id("first_name")).click();
    driver.findElement(By.id("first_name")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("first_name")).sendKeys("Pramod");
    Thread.sleep(1000);
    driver.findElement(By.id("last_name")).clear();
    driver.findElement(By.id("last_name")).sendKeys("Phanait");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div[5]/div/button")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/button")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("imagetest")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("logout")).click();
    Thread.sleep(1000);
    
    System.out.println("Subscription Membership Charge Setting Learners has been successfully Registered Using AMOUNT TRAIL DAYS Voucher Code");
    driver.close();
  }

}
