package pramod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDemo {
	public static void main(String[] args){
		seleniumTest();

}

	public static void seleniumTest(){

//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"\\eclipse-workspace\\pramod\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "Q:\\MyConnect Selenium Automation\\broswerdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://connected.uat.myconnect.olivegroup.io/learner/login");
		driver.findElement(By.name("q")).sendKeys("youtube");
		driver.findElement(By.name("btnK")).sendKeys("Keys.RETURN");

		WebDriverWait wait = new WebDriverWait (driver, 20);

		driver.findElement(By.name("pramod")).click();

		driver.close();
		driver.quit();

    }
}

