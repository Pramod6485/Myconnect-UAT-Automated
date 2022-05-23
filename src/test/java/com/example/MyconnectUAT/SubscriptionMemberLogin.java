package com.example.MyconnectUAT;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SubscriptionMemberLogin {
  private WebDriver driver;
  
  
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  
	//Configuring the system properties of chrome driver
	  
   //System.setProperty("webdriver.chrome.driver", "P:\\Myconnect Automation With Selenium\\Myconnect-UAT-Automated\\driver\\chromedriver.exe");
  //driver = new ChromeDriver();  
    System.setProperty("webdriver.edge.driver", "P:\\Myconnect Automation With Selenium\\Myconnect-UAT-Automated\\driver\\msedgedriver.exe");
    //Initializing the browser driver
    driver = new EdgeDriver();
    //implicit wait
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLoginSubscriptionMemberTestCase() throws Exception {
	//Navigating through a particular website
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/login");
	 //Windows maximize
	driver.manage().window().maximize();
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
    
    System.out.println("Subscription Membership Charge Setting Learners has been successfully Logged In");
    driver.close();
  }
 
}
