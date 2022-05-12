package pramod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestHelloWorld {


@Test
public void testMyconnectLogin(){
	WebDriver driver;

  System.setProperty("webdriver.chrome.driver", "Q:\\MyConnect Selenium Automation\\broswerdriver\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.get("https://connected.uat.myconnect.olivegroup.io/learner/login");
  WebDriverWait wait = new WebDriverWait(driver, 80);
  driver.findElement(By.name("userId")).click();
  driver.findElement(By.name("userId")).clear();
  driver.findElement(By.name("userId")).sendKeys("uat.new20@mailinator.com");
  wait.withTimeout(50, TimeUnit.SECONDS);
  driver.findElement(By.id("password")).click();
  driver.findElement(By.id("password")).clear();
  wait.withTimeout(50, TimeUnit.SECONDS);
  driver.findElement(By.id("password")).sendKeys("P@ssword22");
  wait.withTimeout(120, TimeUnit.SECONDS);
  driver.findElement(By.xpath("//button[@type='button']")).click();
  wait.withTimeout(60, TimeUnit.SECONDS);
  driver.get("https://connected.uat.myconnect.olivegroup.io/hub/home");
  wait.withTimeout(30, TimeUnit.SECONDS);
  driver.findElement(By.id("imagetest")).click();
  driver.findElement(By.id("logout")).click();
  wait.withTimeout(30, TimeUnit.SECONDS);
  driver.get("https://connected.uat.myconnect.olivegroup.io/");
  driver.findElement(By.linkText("SIGN IN")).click();
  driver.close();

}

}


