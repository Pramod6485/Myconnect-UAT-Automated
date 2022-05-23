package com.example.MyconnectUAT;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SubscriptionMemberRegisterWithVoucherCode {
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
  public void testRegisterWithVoucherCodeSBMC() throws Exception {
    driver.get("https://connected.uat.myconnect.olivegroup.io/connected");
    Thread.sleep(1000);
    driver.findElement(By.linkText("SIGN IN")).click();
    driver.findElement(By.id("password")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("password")).sendKeys("P@ssword21");
    Thread.sleep(1000);
    driver.findElement(By.linkText("Register here")).click();
    driver.findElement(By.id("password")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("password")).sendKeys("P@ssword21");
    Thread.sleep(1000);
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("email")).sendKeys("pramod.mod34@yopmail.com");
    Thread.sleep(1000);
    driver.findElement(By.id("password")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='text']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='text']")).clear();
    //Enter your discount voucher code
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bs7WPhmj");
    System.out.println("Voucher code has been accepted");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/div/button")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("email")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("hello.pr45@yopmail.com");
    Thread.sleep(1000);
    driver.findElement(By.id("cardNumber")).click();
    driver.findElement(By.id("cardNumber")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("cardNumber")).sendKeys("4242 4242 4242 4242");
    Thread.sleep(1000);
    driver.findElement(By.id("cardExpiry")).click();
    driver.findElement(By.id("cardExpiry")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("cardExpiry")).sendKeys("04 / 59");
    Thread.sleep(1000);
    driver.findElement(By.id("cardCvc")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("cardCvc")).clear();
    driver.findElement(By.id("cardCvc")).sendKeys("569");
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
    driver.findElement(By.id("first_name")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("first_name")).sendKeys("Pramod");
    Thread.sleep(1000);
    driver.findElement(By.id("last_name")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("last_name")).sendKeys("Chaudhary");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/button")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("imagetest")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("logout")).click();
    System.out.println("Subscription Membership Charge Setting Learners has been successfully Registered Using Voucher Code With Payment");
    driver.close();
  }

  
}
