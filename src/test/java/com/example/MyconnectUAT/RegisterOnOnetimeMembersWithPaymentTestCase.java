package com.example.MyconnectUAT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterOnOnetimeMembersWithPaymentTestCase {
  private WebDriver driver;
  private JavascriptExecutor js;

  @Test
  public void testRegisterOnOnetimeMembersTestCase() throws Exception {
	    System.setProperty("webdriver.chrome.driver", "Q:\\MyConnect Selenium Automation\\broswerdriver\\chromedriver.exe");
	    driver = new ChromeDriver();
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/login");
    driver.findElement(By.linkText("Register here")).click();
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/register");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("hello.pramod.kumar32@yopmail.com");
    Thread.sleep(1000);
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("P@ssword34");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("inlineRadio2")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("inlineRadio1")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/div/button/i")).click();
    Thread.sleep(1000);
    driver.get("https://checkout.stripe.com/pay/cs_test_a1QrUBVhZ7bRShvobNDTjw3XnFfsAwaj9XWUb6KGhnCrxJIPtnwD8uQ5ZQ#fidkdWxOYHwnPyd1blpxYHZxWjxsbm1DcF9dYk9jdU0yTmY0Sj1tV0JiZCcpJ2hsYXYnP34nYnBsYSc%2FJ2ZmYTNnPGcwKDMwPWEoMWdjYyhnYz03KGc2YzwwNGdmMzE2ZDBmPWFkNScpJ2hwbGEnPydhYWAxPTw8Zyg8M2YwKDEwZmEoPTNnNihkZmQ1NjE1PGc0ZzNkPTZkM2cnKSd2bGEnPyc8MzdkMTA2ZChkND1gKDEzMmMoPGE2NSg8MWNgNmQ0NTxhMmNgND1mMzMneCknZ2BxZHYnP15YKSdpZHxqcHFRfHVgJz8ndmxrYmlgWmxxYGgnKSd3YGNgd3dgd0p3bGJsayc%2FJ21xcXV2PyoqZmpra2BmcWBhK3BkcStofGZqa2tgZnEramlsc2Bid2pwdStsaid4JSUl");
    Thread.sleep(1000);
    driver.findElement(By.id("email")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("email")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("email")).sendKeys("stripe.hello4@yopmail.com");
    Thread.sleep(1000);
    driver.findElement(By.id("cardNumber")).click();
    driver.findElement(By.id("cardNumber")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("cardNumber")).sendKeys("4242 4242 4242 4242");
    driver.findElement(By.id("cardExpiry")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("cardExpiry")).sendKeys("02 / 54");
    driver.findElement(By.id("billingName")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("billingName")).sendKeys("Pramod Chaudhary");
    driver.findElement(By.id("cardCvc")).click();
    driver.findElement(By.id("cardExpiry")).click();
    driver.findElement(By.id("cardCvc")).click();
    driver.findElement(By.id("cardCvc")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("cardCvc")).sendKeys("354");
    Thread.sleep(1000);
    driver.findElement(By.id("billingName")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("billingCountry")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("enableStripePass")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("phoneNumber")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("phoneNumber")).sendKeys("987-4587513");
    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/div[2]/form/div[2]/div[2]/button/div[3]")).click();
    Thread.sleep(1000);
    driver.get("https://checkout.stripe.com/pay/cs_test_a1WbgY80YLqI4IqGPVJrSZfNtDo78Mns5jD4Lgh0NosaBBGD6g6mEHKd9V#fidkdWxOYHwnPyd1blpxYHZxWjxsbm1DcF9dYk9jdU0yTmY0Sj1tV0JiZCcpJ2hsYXYnP34nYnBsYSc%2FJzZhNzxgMTE8KDMyNDwoMT1hZChkNGYwKGY9YDE2NDM9ZzU9YGRnNzAwYScpJ2hwbGEnPyc0NGE8MDY9ZCgxPDAyKDE0YTcoPTMwNShgNWM3NTM1PDc2ZmBjNTVkNzwnKSd2bGEnPyc1Z2c3YTY0Mig2MGMxKDE3MTwoPTQ3PShjZmYyMzM0ZmQ8NTVnYWA8MTQneCknZ2BxZHYnP15YKSdpZHxqcHFRfHVgJz8ndmxrYmlgWmxxYGgnKSd3YGNgd3dgd0p3bGJsayc%2FJ21xcXV2PyoqZmpra2BmcWBhK3BkcStofGZqa2tgZnEramlsc2Bid2pwdStsaid4JSUl");
    Thread.sleep(1000);
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/register");
    Thread.sleep(1000);
    driver.findElement(By.id("first_name")).click();
    driver.findElement(By.id("first_name")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("first_name")).sendKeys("pramod");
    driver.findElement(By.id("last_name")).click();
    driver.findElement(By.id("last_name")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("last_name")).sendKeys("ontime");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/form/div[5]/div/button")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/button")).click();
    Thread.sleep(1000);
    driver.get("https://connected.uat.myconnect.olivegroup.io/hub/home");
    driver.findElement(By.id("imagetest")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("logout")).click();
    driver.close();
    Thread.sleep(3000);
  }

}
