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
    System.setProperty("webdriver.chrome.driver", "F:\\Automate\\MyConnect-Automate\\driver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    //System.setProperty("webdriver.edge.driver", "P:\\Myconnect Automation With Selenium\\Myconnect-UAT-Automated\\\\driver\\msedgedriver.exe");
    //driver = new EdgeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testRegisterOnSubscripitionWithPaymentTestCase() throws Exception {
	
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/login");
    driver.findElement(By.linkText("Register here")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("email")).sendKeys("payment.lea9@yopmail.com");
    Thread.sleep(1500);
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
    js.executeScript("window.scrollBy(0,350)", "");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/div/div/div/button")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("email")).clear();
    Thread.sleep(1500);
    driver.findElement(By.id("email")).sendKeys("pramod.learner34@yopmail.com");
    Thread.sleep(1500);
    driver.findElement(By.id("cardNumber")).sendKeys("4242 4242 4242 4242");
    Thread.sleep(1000);
    driver.findElement(By.id("cardExpiry")).sendKeys("06 / 56");
    Thread.sleep(1000);
    driver.findElement(By.id("cardCvc")).sendKeys("145");
    Thread.sleep(1000);
    driver.findElement(By.id("billingName")).sendKeys("Pramod");
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("billingCountry"))).selectByVisibleText("Nepal");
    Thread.sleep(2000);
	driver.findElement(By.id("enableStripePass")).click();
    Thread.sleep(5000);
	/*
	 * driver.findElement(By.id("phoneNumber")).sendKeys("9874521611");
	 * js.executeScript("window.scrollBy(0,350)", ""); Thread.sleep(2000);
	 * driver.findElement(By.xpath(
	 * "//div[@id='root']/div/div/div[2]/div/div[2]/form/div[2]/div[2]/button/div[3]"
	 * )).click(); Thread.sleep(1000);
	 * driver.findElement(By.id("phoneNumber")).clear();
	 * driver.findElement(By.id("phoneNumber")).sendKeys(""); Thread.sleep(1000);
	 * driver.findElement(By.id("billingCountry")).click();
	 */
    driver.findElement(By.id("phoneNumber")).sendKeys("987-8451578");
    js.executeScript("window.scrollBy(0,350)", "");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/div[2]/form/div[2]/div[2]/button/div[3]")).click();
    Thread.sleep(4000);
    driver.findElement(By.id("first_name")).sendKeys("Pramod9");
    Thread.sleep(1000);
	driver.findElement(By.id("last_name")).sendKeys("Test9");
    Thread.sleep(1000);
    //Click on Continue
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    //Click on Continue
    driver.findElement(By.xpath("//button[@type='button']")).click();
    js.executeScript("window.scrollBy(0,350)", "");
    Thread.sleep(2000);
    //Select Color
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div[5]/div/button")).click();
    Thread.sleep(1000);
    //Click Continue
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/button")).click();
    js.executeScript("window.scrollBy(0,-350)", "");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"imagetest\"]")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("logout")).click();
    driver.close();
    
  }

}
