package com.example.MyconnectUAT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterOnNoMembershipChargeSettingTestCase {
  private WebDriver driver;
  private JavascriptExecutor js;

  @Test
  public void testRegisterOnNoMembershipChargeSettingTestCase() throws Exception {
	  
	  //Configuring the system properties of chrome driver
	   System.setProperty("webdriver.chrome.driver", "Q:\\MyConnect Selenium Automation\\broswerdriver\\chromedriver.exe");
	    
	  //Initializing the browser driver
	    driver = new ChromeDriver();
	  //Windows maximize
	    driver.manage().window().maximize();
	    
	   //Navigating through a particular website
	    driver.get("https://connected.uat.myconnect.olivegroup.io/");
	    
	  //implicit wait
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	  //js executor
	    js = (JavascriptExecutor) driver;
    
    
    driver.findElement(By.linkText("SIGN IN")).click();
    driver.findElement(By.linkText("Register here")).click();
    driver.findElement(By.id("email")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("automate.pramod.learner258@yopmail.com");
    Thread.sleep(1000);
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("password")).sendKeys("P@ssword1");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("first_name")).click();
    driver.findElement(By.id("first_name")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("first_name")).sendKeys("Automate");
    driver.findElement(By.id("last_name")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("last_name")).sendKeys("Myconnect");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/button")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("imagetest")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("logout")).click();
    Thread.sleep(6000);
    driver.close();
  }

}
