package com.example.MyconnectUATRegisterAndLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LearnerRegisterNoMembershipChargeTestCase {
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
  public void testLearnerRegisterNoMembershipChargeTestCase() throws Exception {
    driver.get("https://uat.superadmin.myconnect.olivegroup.io/login");
    driver.findElement(By.xpath("//input")).click();
    driver.findElement(By.xpath("//input")).clear();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input")).sendKeys("pramod9");
    Thread.sleep(1000);
    driver.findElement(By.id("password")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("password")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("password")).sendKeys("P@ssword1");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(5000);
    driver.get("https://uat.superadmin.myconnect.olivegroup.io/dashboard");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='root']/div/div/nav/div/ul/li[3]/a/span")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='root']/div/div/nav/div/ul/li[3]/div/div/div[3]/span[2]")).click();
    Thread.sleep(5000);
    driver.get("https://uat.superadmin.myconnect.olivegroup.io/clients");
    Thread.sleep(5000);
    driver.findElement(By.name("name")).click();
    Thread.sleep(5000);
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("connected");
    Thread.sleep(5000);
    driver.findElement(By.name("name")).sendKeys(Keys.ENTER);
    Thread.sleep(5000);
    driver.findElement(By.linkText("Client Setting")).click();
    Thread.sleep(5000);
    driver.get("https://uat.superadmin.myconnect.olivegroup.io/client-settings/60091e17b9e652845c12c08d");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div/div[2]/ul/li[11]/span/span")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("membershipOptions")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]")).click();
    Thread.sleep(5000);
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/login");
    Thread.sleep(5000);
    driver.findElement(By.linkText("Register here")).click();
    Thread.sleep(5000);
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/register");
    Thread.sleep(5000);
    driver.findElement(By.id("email")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("email")).clear();
    Thread.sleep(5000);
    driver.findElement(By.id("email")).sendKeys("pramod.phanait6485@yopmail.com");
    Thread.sleep(5000);
    driver.findElement(By.id("password")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("P@ssword1");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("first_name")).click();
    driver.findElement(By.id("first_name")).clear();
    Thread.sleep(5000);
    driver.findElement(By.id("first_name")).sendKeys("Pramod");
    Thread.sleep(5000);
    driver.findElement(By.id("last_name")).clear();
    driver.findElement(By.id("last_name")).sendKeys("Chaudhary");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div[6]/div/button")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/button")).click();
    Thread.sleep(5000);
    driver.get("https://connected.uat.myconnect.olivegroup.io/hub/home");
    Thread.sleep(5000);
    driver.findElement(By.id("imagetest")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("logout")).click();
    Thread.sleep(10000);
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
