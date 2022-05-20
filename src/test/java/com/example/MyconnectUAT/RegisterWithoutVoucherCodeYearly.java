package com.example.MyconnectUAT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterWithoutVoucherCodeYearly {
	private WebDriver driver;
	private JavascriptExecutor js;
	private String url = "https://creditpay.uat.myconnect.olivegroup.io/learner/login";
	
   @BeforeTest
	public void setUp() throws Exception {
		  System.setProperty("webdriver.chrome.driver", "F:\\Automate\\MyConnect-Automate\\driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  js = (JavascriptExecutor) driver;
		  }
	  
	  @Test
	  public void initialize() throws InterruptedException {
		  	driver.get(url);
		    driver.findElement(By.linkText("Register here")).click();
		    //Click on Cookies button
		    driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div/a[1]")).click();
		    js.executeScript("window.scrollBy(0,350)", "");
		    Thread.sleep(1500);
		    driver.findElement(By.id("email")).sendKeys("automateOTPuser2@yopmail.com");
		    Thread.sleep(1500);
		    driver.findElement(By.id("password")).sendKeys("Hiup@123");
		    Thread.sleep(1500);
		    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		    Thread.sleep(1500);
		    //Click Continue
		    driver.findElement(By.xpath("//button[@type='button']")).click();
		    Thread.sleep(1500);
		    driver.findElement(By.id("inlineRadio1")).click();
		    Thread.sleep(1500);
		    
		    //ScrollDown
		   // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		    //Thread.sleep(3000);
		    
		    //Click Pay Button
		    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/div/div/div/button")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.id("email")).clear();
		    Thread.sleep(1500);
		    driver.findElement(By.id("email")).sendKeys("automateOTPuser2@yopmail.com");
		    Thread.sleep(1500);
		    driver.findElement(By.id("cardNumber")).sendKeys("4242 4242 4242 4242");
		    Thread.sleep(1000);
		    driver.findElement(By.id("cardExpiry")).sendKeys("06 / 23");
		    Thread.sleep(1000);
		    driver.findElement(By.id("cardCvc")).sendKeys("124");
		    Thread.sleep(1000);
		    driver.findElement(By.id("billingName")).sendKeys("Autouser 2");
		    Thread.sleep(1000);
		    new Select(driver.findElement(By.id("billingCountry"))).selectByVisibleText("Nepal");
		    Thread.sleep(2000);
			driver.findElement(By.id("enableStripePass")).click();
		    Thread.sleep(5000);
		
		    driver.findElement(By.id("phoneNumber")).sendKeys("9804123654");
		    js.executeScript("window.scrollBy(0,350)", "");
		    Thread.sleep(2000);
		    //Click Pay Button
		    WebElement stripepaybutton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/form/div[2]/div[2]/button/div[3]"));
		    js.executeScript("arguments[0].scrollIntoView();", stripepaybutton);
		    stripepaybutton.click();

		   // driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div/div[2]/form/div[2]/div[2]/button/div[3]")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.id("first_name")).sendKeys("Automate OTP User 2");
		    Thread.sleep(2000);
			driver.findElement(By.id("last_name")).sendKeys("Test");
		    Thread.sleep(2000);
		    //Click on Continue
		    driver.findElement(By.xpath("//button[@type='button']")).click();
		    Thread.sleep(2000);
		    //Click on Continue
		    driver.findElement(By.xpath("//button[@type='button']")).click();
		    js.executeScript("window.scrollBy(0,350)", "");
		    Thread.sleep(2000);
			/*
			 * //Select Organization Color 
			 * //driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div[5]/div/button")).click();
			 * //Thread.sleep(2000);
			 * 
			 * //Click Continue
			 * driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/button")).click
			 * ();
			 */
		    js.executeScript("window.scrollBy(0,-350)", "");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id=\"imagetest\"]")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.id("logout")).click();
		       
	  }
	  
	  @AfterTest
	  public void closebrowser() {
		  driver.close();
	  }
}
