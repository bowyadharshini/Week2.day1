package Week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {

	public static void main(String[] args) {
		           
				 
				 WebDriverManager.chromedriver().setup();
				  ChromeDriver driver=new ChromeDriver();
				 driver.get("http://leaftaps.com//opentaps//control//main\\");
				   
				  driver.findElement(By.id("username")).sendKeys("DemoCSR");
			         
			      driver.findElement(By.id("password")).sendKeys("crmsfa");
			        
			        driver.findElement(By.className("decorativeSubmit")).click();
			        
			        driver.findElement(By.linkText("CRM/SFA")).click();
			        //driver.findElement(By.linkText("leads")).click();
			        driver.findElement(By.partialLinkText( "Create Lead")).click();
			        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IBM");
			        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("srinithi");
			        driver.findElement(By.id("createLeadForm_lastName")).sendKeys( "sivakumar");
			        WebElement  Source =driver.findElement( By.id("createLeadForm_dataSourceId"));
			         Select van =new Select(Source);
			         van.selectByIndex(2);
			        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("kavi");
			        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("computer science");
			        driver.findElement(By.id("createLeadForm_description")).sendKeys("my dream company is TCS");
			        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bhaviy2020@gmail.com");
			        //driver.findElement(By.id(null));
			        
			        WebElement FindElementss=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			        Select ss=new Select(FindElementss);
			        ss.selectByVisibleText("New York");
			        driver.findElement( By.className( "smallSubmit")).click();
			        System.out.println("The title is"+driver.getTitle());
			        
			        
			         
			         
			         
			        
			    }

	}


