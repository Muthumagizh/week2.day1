package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocateLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.close();
		Thread.sleep(2000);
		WebElement elelogin=driver.findElement(By.id("username"));
		WebElement elepass=driver.findElement(By.id("password"));
		elelogin.sendKeys("Demosalesmanager");
		elepass.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SCB");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Muthukumaran");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kaliyamoorthy");
		String Firstname= driver.findElement(By.id("createLeadForm_firstName")).getText();
		System.out.println(Firstname);
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
			}

	}


