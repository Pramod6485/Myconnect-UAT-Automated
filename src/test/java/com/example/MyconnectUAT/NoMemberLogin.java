package com.example.MyconnectUAT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NoMemberLogin {
  private WebDriver driver;
  @Test
  public void testLoginOnNoMembershipChargeLearnerTestCase() throws Exception {
	  
	//Configuring the system properties of chrome driver
	  
	//System.setProperty("webdriver.chrome.driver", "F:\\Myconnect-UAT-Automated\\driver\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "P:\\Myconnect Automation With Selenium\\Myconnect-UAT-Automated\\driver\\chromedriver.exe");
	
	 //Initializing the browser driver
	driver = new ChromeDriver();
	
	 //Windows maximize
	driver.manage().window().maximize();
	
	//Navigating through a particular website
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/login");
    
    //implicit wait
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    //click your userId field
    driver.findElement(By.name("userId")).click();
    //Enter your userId
    driver.findElement(By.name("userId")).sendKeys("automate.pramod251@yopmail.com");
    Thread.sleep(1000);
    //click your password field
    driver.findElement(By.id("password")).click();
    Thread.sleep(1000);
    //Enter your password
    driver.findElement(By.id("password")).sendKeys("P@ssword1");
    Thread.sleep(1000);
    //click your login button
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("imagetest")).click();
    Thread.sleep(1000);
    //click your logout button
    driver.findElement(By.id("logout")).click();
    Thread.sleep(3000);
    //result successful login message output
    System.out.println("No Membership Charge Setting Learners has been successfully Logged In");
    driver.close();
  }


}
