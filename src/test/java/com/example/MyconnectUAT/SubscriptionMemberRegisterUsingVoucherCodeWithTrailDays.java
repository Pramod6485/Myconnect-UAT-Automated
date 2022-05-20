package com.example.MyconnectUAT;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SubscriptionMemberRegisterUsingVoucherCodeWithTrailDays {
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
  public void testRegisterUsingVoucherCodeWithTrailSBMC() throws Exception {
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/login");
    Thread.sleep(1000);
    driver.findElement(By.linkText("Register here")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("email")).sendKeys("pramod.register100@yopmail.com");
    Thread.sleep(1000);
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("P@ssword34");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/form")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='text']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='text']")).clear();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("KWXg3xIw");
    System.out.println("Trail Days Discount Voucher code has been accepted");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/div/p/div[2]/input")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/div/button")).click();
    Thread.sleep(4000);
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("email")).sendKeys("pramod.stripe45@yopmail.com");
    Thread.sleep(1000);
    driver.findElement(By.id("cardNumber")).clear();
    driver.findElement(By.id("cardNumber")).sendKeys("4242 4242 4242 4242");
    Thread.sleep(1000);
    driver.findElement(By.id("cardExpiry")).clear();
    driver.findElement(By.id("cardExpiry")).sendKeys("06 / 56");
    Thread.sleep(1000);
    driver.findElement(By.id("cardCvc")).clear();
    driver.findElement(By.id("cardCvc")).sendKeys("652");
    Thread.sleep(1000);
    driver.findElement(By.id("billingName")).sendKeys("Pramod Chaudhary");
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
    driver.findElement(By.id("first_name")).sendKeys("Prmod");
    Thread.sleep(1000);
    driver.findElement(By.id("last_name")).click();
    driver.findElement(By.id("last_name")).clear();
    driver.findElement(By.id("last_name")).sendKeys("Phana");
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
    Thread.sleep(2000);
    System.out.println("Subscription Membership Charge Setting Learners has been successfully Registered Using Voucher Code With Trail Days");
    driver.close();
  }


}
