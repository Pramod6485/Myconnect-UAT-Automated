package com.example.MyconnectUAT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SubscriptionMemberRegisterWithYearlyPayment {
  private WebDriver driver;
  private JavascriptExecutor js;
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "P:\\Myconnect Automation With Selenium\\Myconnect-UAT-Automated\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
  }

  @Test
  public void testRegisterSBMC() throws Exception {
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/login");
    driver.manage().deleteAllCookies();
    Thread.sleep(1000);
//    driver.findElement(By.id("password")).clear();
//    driver.findElement(By.id("password")).sendKeys("P@ssword21");
//    Thread.sleep(1000);
    driver.findElement(By.linkText("Register here")).click();
    Thread.sleep(1000);
//    driver.findElement(By.id("password")).clear();
//    driver.findElement(By.id("password")).sendKeys("P@ssword21");
//    driver.findElement(By.id("email")).click();
//    Thread.sleep(1000);
//    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("pramod.pmod34@yopmail.com");
    Thread.sleep(1000);
    driver.findElement(By.id("password")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("password")).sendKeys("P@ssword34");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/div/p/div[2]/input")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/div/button")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("email")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("email")).sendKeys("pr.mod64856@yopmail.com");
    Thread.sleep(1000);
    driver.findElement(By.id("cardNumber")).sendKeys("4242 4242 4242 4242");
    Thread.sleep(1000);
    driver.findElement(By.id("cardExpiry")).sendKeys("06/67");
    Thread.sleep(1000);
    driver.findElement(By.id("cardCvc")).sendKeys("158");
    Thread.sleep(1000);
    driver.findElement(By.id("billingName")).sendKeys("Pramod");
    Thread.sleep(1000);
    driver.findElement(By.id("billingCountry")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//option[@value='NP']")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("enableStripePass")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("phoneNumber")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("phoneNumber")).sendKeys("981-7856498");
    Thread.sleep(1000);
//    js.executeScript("window.scrollBy(0,350)", "");
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[2]/div[2]/button/div[3]")).click();
    Thread.sleep(4000);
    driver.findElement(By.id("first_name")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("first_name")).sendKeys("Pramod");
    Thread.sleep(1000);
    driver.findElement(By.id("last_name")).sendKeys("Chaudhary");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div[6]/div/button")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/button")).click();
    driver.findElement(By.id("imagetest")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("logout")).click();
    
    System.out.println("Subscribe Membership Charge Setting has been Successfully registered With Yearly Payment");
    driver.close();
  }

  
}
