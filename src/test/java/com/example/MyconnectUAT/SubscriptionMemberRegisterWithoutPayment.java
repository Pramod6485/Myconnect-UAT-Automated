package com.example.MyconnectUAT;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class SubscriptionMemberRegisterWithoutPayment {
  private WebDriver driver;
  
  
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	
	//Configuring the system properties of chrome driver
    System.setProperty("webdriver.chrome.driver", "P:\\Myconnect Automation With Selenium\\Myconnect-UAT-Automated\\driver\\chromedriver.exe");
    //Initializing the browser driver
    driver = new ChromeDriver();
    //implicit wait
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testRegisterOnSubscriptionMemberTestCase() throws Exception {
	//Navigating through a particular website
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/login");
  //Windows maximize
    driver.manage().window().maximize();
    driver.findElement(By.linkText("Register here")).click();
    Thread.sleep(1500);
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/register");
    driver.findElement(By.id("email")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("email")).sendKeys("pramod.regist121@mailinator.com");
    Thread.sleep(1500);
    driver.findElement(By.id("password")).sendKeys("P@ssword12");
    Thread.sleep(1500);
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    Thread.sleep(1500);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("inlineRadio2")).click();
    Thread.sleep(1500);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("first_name")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("first_name")).sendKeys("Pramod");
    Thread.sleep(1500);
    driver.findElement(By.id("last_name")).sendKeys("Phanait");
    Thread.sleep(1500);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1500);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1500);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/button")).click();
    Thread.sleep(1500);
    driver.get("https://connected.uat.myconnect.olivegroup.io/hub/home");
    Thread.sleep(1500);
    driver.findElement(By.id("imagetest")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("logout")).click();
    Thread.sleep(1500);
    System.out.println("Subscription Membership Charge Setting Learners has been successfully Registered Without Payment");
    driver.close();
  }

}
