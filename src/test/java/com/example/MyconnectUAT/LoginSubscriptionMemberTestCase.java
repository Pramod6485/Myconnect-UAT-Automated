package com.example.MyconnectUAT;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginSubscriptionMemberTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.edge.driver", "P:\\Myconnect Automation With Selenium\\Myconnect-UAT-Automated\\driver\\msedgedriver.exe");
    driver = new EdgeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testLoginSubscriptionMemberTestCase() throws Exception {
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/login");
    driver.findElement(By.name("userId")).click();
    driver.findElement(By.name("userId")).clear();
    Thread.sleep(1500);
    driver.findElement(By.name("userId")).sendKeys("pramod.subscription.user3@yopmail.com");
    Thread.sleep(1500);
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    Thread.sleep(1500);
    driver.findElement(By.id("password")).sendKeys("P@ssword34");
    Thread.sleep(1500);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1500);
    driver.get("https://connected.uat.myconnect.olivegroup.io/hub/home");
    Thread.sleep(1500);
    driver.findElement(By.id("imagetest")).click();
    Thread.sleep(1500);
    driver.findElement(By.linkText("Billing History")).click();
    Thread.sleep(1500);
    driver.get("https://connected.uat.myconnect.olivegroup.io/hub/profile/billing-history");
    Thread.sleep(1500);
    driver.findElement(By.id("imagetest")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("logout")).click();
    driver.close();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

 
}
