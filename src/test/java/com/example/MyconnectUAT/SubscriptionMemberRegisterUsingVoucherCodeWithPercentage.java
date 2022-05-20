package com.example.MyconnectUAT;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SubscriptionMemberRegisterUsingVoucherCodeWithPercentage {
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
  public void testRegisterUsingVoucherCodeWithPercentageSBMC() throws Exception {
    driver.get("https://connected.uat.myconnect.olivegroup.io/connected");
    driver.findElement(By.linkText("SIGN IN")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Register here")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("pramod.percentage21@yopmail.com");
    Thread.sleep(1000);
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("P@ssword34");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/div/p/div[2]/input")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='text']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='text']")).clear();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ntRtR2Be");
    System.out.println("Percentage Discount Voucher code has been accepted");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/div/button")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("email")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("percentage.trail.pramod@yopmail.com");
    Thread.sleep(1000);
    driver.findElement(By.id("cardNumber")).clear();
    driver.findElement(By.id("cardNumber")).sendKeys("4242 4242 4242 4242");
    Thread.sleep(1000);
    driver.findElement(By.id("cardExpiry")).clear();
    driver.findElement(By.id("cardExpiry")).sendKeys("06 / 56");
    Thread.sleep(1000);
    driver.findElement(By.id("cardCvc")).clear();
    driver.findElement(By.id("cardCvc")).sendKeys("656");
    Thread.sleep(1000);
    driver.findElement(By.id("billingName")).sendKeys("QA Automate");
    Thread.sleep(1000);
    driver.findElement(By.id("billingCountry")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//option[@value='NP']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/div[2]/form/div[2]/div[2]/button/div[3]")).click();
    Thread.sleep(4000);
    driver.findElement(By.id("first_name")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("first_name")).clear();
    driver.findElement(By.id("first_name")).sendKeys("Percentage");
    Thread.sleep(1000);
    driver.findElement(By.id("last_name")).click();
    driver.findElement(By.id("last_name")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("last_name")).sendKeys("Discount");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div[2]/div/button")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/button")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("imagetest")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("logout")).click();
    Thread.sleep(1000);
    System.out.println("Subscription Membership Charge Setting Learners has been successfully Registered Using PERCENTAGE (%) Voucher Code");
    driver.close();
  }

 
}
