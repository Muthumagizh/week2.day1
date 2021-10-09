package week2.day1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2day1Assignement {

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
		driver.findElement(By.name("firstNameLocal")).sendKeys("Muthu");
		driver.findElement(By.name("lastNameLocal")).sendKeys("Muthu");
		
		driver.findElement(By.name("personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/22/21");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("createLeadForm_description");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("createLeadForm_importantNote");
		
		
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000000Cr");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("SIC");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("tick");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("1");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("23442345235");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("44");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("100");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("233");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mai@mail.com");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Name");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Check");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Adsdress111");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Addr2");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("city");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600117");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("6117");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Alabama");
		Thread.sleep(200);
		String Firstname= driver.findElement(By.id("createLeadForm_firstName")).getText();
		System.out.println(Firstname);
				
		driver.findElement(By.className("smallSubmit")).click();
		String title= driver.getTitle();
		System.out.println(title);
		if(title.contains("View Lead" )) {System.out.println("Title is valid");}
		else {
			System.out.println("title invalid");
		}
				
		
			}

	}


