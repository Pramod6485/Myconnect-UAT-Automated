package com.example.MyconnectUAT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterOnSubscripitionWithPaymentTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "P:\\Myconnect Automation With Selenium\\Myconnect-UAT-Automated\\\\driver\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testRegisterOnSubscripitionWithPaymentTestCase() throws Exception {
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/login");
    driver.findElement(By.linkText("Register here")).click();
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/register");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    Thread.sleep(1500);
    driver.findElement(By.id("email")).sendKeys("payment.lea2@yopmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("P@ssword12");
    Thread.sleep(1500);
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    Thread.sleep(1500);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("inlineRadio2")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("inlineRadio1")).click();
    Thread.sleep(1500);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/div/p/div[2]/input")).click();
    Thread.sleep(1500);
    driver.findElement(By.name("subscriptionOptions")).click();
    Thread.sleep(1500);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/div/button")).click();
    Thread.sleep(2000);
    driver.get("https://checkout.stripe.com/pay/cs_test_a1EcmnCjQl17NX1ncDyegbnSCloq7E5XLSd3gm1xSZtaFzCzY14w4Pi7C2#fidkdWxOYHwnPyd1blpxYHZxWjxsbm1DcF9dYk9jdU0yTmY0Sj1tV0JiZCcpJ2hsYXYnP34nYnBsYSc%2FJzE1M2Q2NjZgKDI8MzIoMTNhNChkPTdnKDQ8ZzYxNzdjMGc9PGFkYGMyZycpJ2hwbGEnPyc1YWAzYzw9Nig2MDU9KDE0PWcoZGEzZihgZGc3NWM8Y2ZkMzAxNWExYDcnKSd2bGEnPyc0NTcxMjQ0MShkYTBgKDE3PDEoPDVnYSgxNTIyMjFgMjBgZDw3YDY9MmMneCknZ2BxZHYnP15YKSdpZHxqcHFRfHVgJz8ndmxrYmlgWmxxYGgnKSd3YGNgd3dgd0p3bGJsayc%2FJ21xcXV2PyoqZmpra2BmcWBhK3BkcStofGZqa2tgZnEramlsc2Bid2pwdStsaid4JSUl");
    Thread.sleep(5000);
    driver.findElement(By.id("email")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("email")).clear();
    Thread.sleep(1500);
    driver.findElement(By.id("email")).sendKeys("pramod.learner34@yopmail.com");
    Thread.sleep(1500);
    driver.findElement(By.id("cardNumber")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("cardNumber")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("cardNumber")).sendKeys("4242 4242 4242 4242");
    Thread.sleep(1000);
    driver.findElement(By.id("cardExpiry")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("cardExpiry")).sendKeys("06 / 56");
    Thread.sleep(1000);
    driver.findElement(By.id("billingName")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("billingName")).sendKeys("Pramod Phanait");
    Thread.sleep(1000);
    driver.findElement(By.id("cardExpiry")).click();
    driver.findElement(By.id("cardCvc")).click();
    driver.findElement(By.id("cardCvc")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("cardCvc")).sendKeys("145");
    driver.findElement(By.id("billingName")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("billingCountry")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("billingCountry"))).selectByVisibleText("Morocco");
    Thread.sleep(3000);
    driver.findElement(By.id("enableStripePass")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("phoneNumber")).clear();
//    driver.findElement(By.id("phoneNumber")).sendKeys("98745216");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/div[2]/form/div[2]/div[2]/button/div[3]")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("phoneNumber")).clear();
    driver.findElement(By.id("phoneNumber")).sendKeys("");
    Thread.sleep(1000);
    driver.findElement(By.id("billingCountry")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("billingCountry"))).selectByVisibleText("Nepal");
    Thread.sleep(1000);
    driver.findElement(By.id("phoneNumber")).click();
    driver.findElement(By.id("phoneNumber")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("phoneNumber")).sendKeys("987-8451578");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/div[2]/form/div[2]/div[2]/button/div[3]")).click();
    Thread.sleep(1000);
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/register/in-progress?session_id=cs_test_a1vo03HW1YYCVWmI7EWdK9EFNqhQaBmFCCBWKhby3Pqn8cSPQq8Z1yiKWm");
    Thread.sleep(6000);
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/register");
    Thread.sleep(3000);
    driver.findElement(By.id("first_name")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("first_name")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("first_name")).sendKeys("Pramod");
    Thread.sleep(1000);
    driver.findElement(By.id("last_name")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("last_name")).sendKeys("Registered");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div[5]/div/button")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/button")).click();
    Thread.sleep(1000);
    driver.get("https://connected.uat.myconnect.olivegroup.io/hub/home");
    Thread.sleep(1000);
    driver.findElement(By.id("imagetest")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("logout")).click();
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
