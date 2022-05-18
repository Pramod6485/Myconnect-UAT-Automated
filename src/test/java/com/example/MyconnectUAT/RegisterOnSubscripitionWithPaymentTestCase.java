package com.example.MyconnectUAT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
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
    System.setProperty("webdriver.edge.driver", "P:\\Myconnect Automation With Selenium\\Myconnect-UAT-Automated\\\\driver\\msedgedriver.exe");
    driver = new EdgeDriver();
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
    driver.findElement(By.id("email")).sendKeys("payment.use00231@yopmail.com");
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
    driver.get("https://checkout.stripe.com/pay/cs_test_a1t03FbZmYTPVJ3mvt7DHnBQUavL7dy3NCGTyQZsg4W7wPmpRT6BA9xSHd#fidkdWxOYHwnPyd1blpxYHZxWjxsbm1DcF9dYk9jdU0yTmY0Sj1tV0JiZCcpJ2hsYXYnP34nYnBsYSc%2FJzIwZD0wZjdgKGFmMjUoMWc1ZihnMzU2KGYwPTdgNmM9Y2dkMjdjMWE3MicpJ2hwbGEnPydjYGZmMTM0NShmNmZkKDE8YGAoZzAzMigyZzQ9MWdgZDVgYDYwZ2AwND0nKSd2bGEnPycxPDEzMzBnMihmZGdhKDExPWQoPTBnZyg1NDU8YWM9MDMxMjwwYGA9PWAneCknZ2BxZHYnP15YKSdpZHxqcHFRfHVgJz8ndmxrYmlgWmxxYGgnKSd3YGNgd3dgd0p3bGJsayc%2FJ21xcXV2PyoqZmpra2BmcWBhK3BkcStofGZqa2tgZnEramlsc2Bid2pwdStsaid4JSUl");
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
    Thread.sleep(4000);
    Alert alert = driver.switchTo().alert();
    Thread.sleep(1000);
    alert.accept();
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/register/in-progress?session_id=cs_test_a1vo03HW1YYCVWmI7EWdK9EFNqhQaBmFCCBWKhby3Pqn8cSPQq8Z1yiKWm");
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);;
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/register");
    Thread.sleep(1000);
    driver.findElement(By.name("firstName")).click();
    Thread.sleep(1000);
    driver.findElement(By.name("firstName")).clear();
    Thread.sleep(1000);
    driver.findElement(By.name("firstName")).sendKeys("Pramod");
    Thread.sleep(1000);
    driver.findElement(By.name("lastName")).clear();
    Thread.sleep(1000);
    driver.findElement(By.name("lastName")).sendKeys("Registered");
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

}
