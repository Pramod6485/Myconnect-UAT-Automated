package com.example.MyconnectUAT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginOnNoMembershipChargeLearnerTestCase {
  private WebDriver driver;
  private JavascriptExecutor js;
  
  @Test
  public void testLoginOnNoMembershipChargeLearnerTestCase() throws Exception {
	System.setProperty("webdriver.chrome.driver", "Q:\\MyConnect Selenium Automation\\broswerdriver\\chromedriver.exe");
	driver = new ChromeDriver();
    driver.get("https://connected.uat.myconnect.olivegroup.io/learner/login");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
    driver.findElement(By.name("userId")).click();
    driver.findElement(By.name("userId")).clear();
    driver.findElement(By.name("userId")).sendKeys("automate.pramod251@yopmail.com");
    Thread.sleep(1000);
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("password")).sendKeys("P@ssword1");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.get("https://connected.uat.myconnect.olivegroup.io/hub/home");
    Thread.sleep(1000);
    driver.findElement(By.id("imagetest")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("logout")).click();
    Thread.sleep(3000);
    driver.close();
  }

}
