package com.example.MyconnectUAT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnetimeMemberLogin {
  private WebDriver driver;
  
  
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	////Configuring the system properties of chrome driver
    System.setProperty("webdriver.chrome.driver", "P:\\Myconnect Automation With Selenium\\Myconnect-UAT-Automated\\\\driver\\chromedriver.exe");
    //Initializing the browser driver
    driver = new ChromeDriver();
    //implicit wait
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLoginOnOneTimeMembersTestCase() throws Exception {
	//Navigating through a particular website
    driver.get("https://connected.uat.myconnect.olivegroup.io/connected");
    //Windows maximize
    driver.manage().window().maximize();
    //click your signin button
    driver.findElement(By.linkText("SIGN IN")).click();
    //navigate through a login page after clicked signin button
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/login");
    //click your userId
    driver.findElement(By.name("userId")).click();
    Thread.sleep(1500);
    //Enter your userId
    driver.findElement(By.name("userId")).sendKeys("pramod.onetime.user3133@yopmail.com");
    Thread.sleep(1500);
    //click your password field
    driver.findElement(By.id("password")).click();
    Thread.sleep(1500);
    //Enter your password
    driver.findElement(By.id("password")).sendKeys("P@ssword1");
    Thread.sleep(1500);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1500);
    driver.get("https://connected.uat.myconnect.olivegroup.io/hub/home");
    Thread.sleep(1500);
    driver.findElement(By.id("imagetest")).click();
    Thread.sleep(1500);
    driver.findElement(By.linkText("Subscribe")).click();
    Thread.sleep(1500);
    driver.get("https://connected.uat.myconnect.olivegroup.io/hub/profile/subscribe");
    Thread.sleep(1500);
    driver.findElement(By.id("imagetest")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("logout")).click();
    
    System.out.println("On Time Membership Charge Setting Learners has been successfully Logged In");
    driver.close();
  }

  
}
