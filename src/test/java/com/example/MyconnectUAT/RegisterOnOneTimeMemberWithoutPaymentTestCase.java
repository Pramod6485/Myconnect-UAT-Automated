package com.example.MyconnectUAT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterOnOneTimeMemberWithoutPaymentTestCase {
  private WebDriver driver;
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "Q:\\MyConnect Selenium Automation\\broswerdriver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testRegisterOnOneTimeMemberWithoutPaymentTestCase() throws Exception {
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/login");
    driver.findElement(By.linkText("Register here")).click();
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/register");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("pramod.onetime.user1@yopmail.com");
    Thread.sleep(1200);
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    Thread.sleep(1200);
    driver.findElement(By.id("password")).sendKeys("P@ssword1");
    Thread.sleep(1200);
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("inlineRadio2")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("first_name")).click();
    driver.findElement(By.id("first_name")).clear();
    driver.findElement(By.id("first_name")).sendKeys("Pramod");
    Thread.sleep(1000);
    driver.findElement(By.id("last_name")).clear();
    driver.findElement(By.id("last_name")).sendKeys("Phanait");
    Thread.sleep(1200);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div[2]/div/button")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/button")).click();
    Thread.sleep(1000);
    driver.get("https://connected.uat.myconnect.olivegroup.io/hub/home");
    Thread.sleep(1000);
    driver.findElement(By.id("imagetest")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Subscribe")).click();
    Thread.sleep(2000);
    driver.get("https://connected.uat.myconnect.olivegroup.io/hub/profile/subscribe");
    Thread.sleep(2000);
    driver.findElement(By.id("imagetest")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("logout")).click();
    Thread.sleep(3000);
    driver.close();
  }

//  @AfterClass(alwaysRun = true)
//  public void tearDown() throws Exception {
//    driver.quit();
//    String verificationErrorString = verificationErrors.toString();
//    if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//    }
//  }
//
//  private boolean isElementPresent(By by) {
//    try {
//      driver.findElement(by);
//      return true;
//    } catch (NoSuchElementException e) {
//      return false;
//    }
//  }
//
//  private boolean isAlertPresent() {
//    try {
//      driver.switchTo().alert();
//      return true;
//    } catch (NoAlertPresentException e) {
//      return false;
//    }
//  }
//
//  private String closeAlertAndGetItsText() {
//    try {
//      Alert alert = driver.switchTo().alert();
//      String alertText = alert.getText();
//      if (acceptNextAlert) {
//        alert.accept();
//      } else {
//        alert.dismiss();
//      }
//      return alertText;
//    } finally {
//      acceptNextAlert = true;
//    }
//  }
}
