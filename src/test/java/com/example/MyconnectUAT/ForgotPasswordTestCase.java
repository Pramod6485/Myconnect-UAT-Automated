package com.example.MyconnectUAT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForgotPasswordTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "P:\\Myconnect Automation With Selenium\\Myconnect-UAT-Automated\\driver\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testForgotPasswordTestCase() throws Exception {
    driver.get("https://connected.uat.myconnect.olivegroup.io/connected");
    driver.findElement(By.linkText("SIGN IN")).click();
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/login");
    driver.findElement(By.linkText("Forgot Password?")).click();
    Thread.sleep(1500);
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/forgot-password");
    Thread.sleep(1500);
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).clear();
    Thread.sleep(1500);
    driver.findElement(By.name("email")).sendKeys("pramod.register203@mailinator.com");
    Thread.sleep(1500);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1500);
    driver.get(baseUrl + "chrome://newtab/");
    Thread.sleep(1500);
    driver.get("https://www.mailinator.com/v4/public/inboxes.jsp?msgid=main.prod112-1649651215-119263378&to=main.prod112#");
    Thread.sleep(1500);
    driver.findElement(By.xpath("//div[@id='inbox_pane']/div")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("inbox_field")).clear();
    Thread.sleep(1500);
    driver.findElement(By.id("inbox_field")).sendKeys("pramod.register203@mailinator.com");
    Thread.sleep(1500);
    driver.findElement(By.xpath("//button[@onclick=\"subInbox($('#inbox_field').val());\"]")).click();
    Thread.sleep(1500);
    driver.get("https://www.mailinator.com/v4/public/inboxes.jsp?msgid=main.prod112-1649651215-119263378&to=pramod.register203#");
    Thread.sleep(1500);
    driver.findElement(By.xpath("//tr[@id='row_pramod.register203-1652792179-230382906']/td[3]")).click();
    driver.get("https://www.mailinator.com/v4/public/inboxes.jsp?msgid=pramod.register203-1652792179-230382906#");
    Thread.sleep(1500);
    //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='connectED'])[1]/following::p[1]")).click();
    Thread.sleep(1500);
    driver.findElement(By.xpath("//a[contains(text(),'Change your password')]")).click();
    Thread.sleep(1500);
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/reset-password/c92576ae64ba7ac3962b86369949540a67a4e918fa5c32745a11fc6e7efa5c98fef68913ff3ef2f1021c948d15c917be5a4862a250114318fac46b84602f58f1651f63ed1bae8f4907a6fcbbf8eee7e0bfb301427a86a564acdffd1e3673e3d1f669977ff883eb4cfcbe909938982773fe493c1d6c9f5002d6dc233b7d907ebc7003788190436673c572b47fbfb61bea08ca18becef5bb19fc76cd4ac70b4a0cc121fe230885cd402b5836dd40d9a49748fcd7f9ba099b43a1927d26971720bae03bf1df33837c0d41227b67867079e7fec07c038bd7ae743c6a9bd315d2dd350c6c537b7af19b69862a2729591f382380d6b325b2070801a53ef746db47db1bf09f8e8bf5d586e5c3c64693f5bee65557a9492b203d2e0f0e1ccefbf9b1d142a7c6d57cba7e6634479c1a6692c51b02920b4ec9b8a63847f4b92ea7c6d6c7da7a1fafe86e48fbed71c053b6b286ed00b609c2");
    Thread.sleep(1500);
    driver.findElement(By.id("newPassword")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("newPassword")).clear();
    Thread.sleep(1500);
    driver.findElement(By.id("newPassword")).sendKeys("P@ssword122");
    Thread.sleep(1500);
    driver.findElement(By.id("confirmPassword")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("confirmPassword")).clear();
    Thread.sleep(1500);
    driver.findElement(By.id("confirmPassword")).sendKeys("P@ssword122");
    Thread.sleep(1500);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1500);
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/login");
    Thread.sleep(1500);
    driver.findElement(By.name("userId")).click();
    driver.findElement(By.name("userId")).clear();
    Thread.sleep(1500);
    driver.findElement(By.name("userId")).sendKeys("pramod.register203@mailinator.com");
    Thread.sleep(1500);
    driver.findElement(By.id("password")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("password")).clear();
    Thread.sleep(1500);
    driver.findElement(By.id("password")).sendKeys("P@ssword122");
    Thread.sleep(1500);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1500);
    driver.get("https://connected.uat.myconnect.olivegroup.io/hub/home");
    Thread.sleep(1500);
    driver.findElement(By.id("imagetest")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("logout")).click();
    Thread.sleep(1500);
    driver.close();
  }

 
}
