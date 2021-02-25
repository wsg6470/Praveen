package org.captcha.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class Captcha {
	
	
static WebDriver driver;
	
String[][] data = {
		{"prav8483","16182062"}, 
		{"vima0953","09531138"}, 
		{"swet1121","69282114"},
		{"mari9100","68257266"}, 
		{"jose6440","23755165"}, 
		{"lawr7800","62521470"},
		{"ebin4321","29591170"},
		{"ruba6221","07951663"},
		{"nels2853","58221060"},
		{"srir8529","08521511"}
};


@DataProvider(name = "login Data")
public String[][] loginDetails() {
return data ;


}


@Test(dataProvider = "login Data")
	public void login(String fName, String fValue) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shano\\eclipse-workspace\\Captcha\\drivers\\chromedriver.exe");
		
			driver = new ChromeDriver();
			
			driver.get("https://www.onlinedataentryjob.com/form-filling-work.php");
			driver.manage().window().maximize();
			
	WebElement loginOpt = driver.findElement(By.xpath("//strong[text()='Login']"));
	loginOpt.click();
	
	WebElement dUser = driver.findElement(By.name("user_name"));
	dUser.sendKeys(fName);
	
	WebElement dPass = driver.findElement(By.name("password"));
	dPass.sendKeys(fValue);
	
	WebElement dSumbit = driver.findElement(By.name("login"));
	dSumbit.click();
	
	WebElement earnMoney =  driver.findElement(By.xpath("//strong[text()='Earn Money']"));
	earnMoney.click();
	
	driver.navigate().refresh();
	
	WebElement earnMoney2 =  driver.findElement(By.xpath("//strong[text()='Earn Money']"));
	earnMoney2.click();
	
	WebElement captchaEntry = driver.findElement(By.xpath("(//img[@alt='START EARNING NOW'])[2]"));
	captchaEntry.click();
	
	Thread.sleep(2000);
	
	WebElement entry1 = driver.findElement(By.xpath("//input[@name='fieldvalue[2558][]']"));
	entry1.sendKeys("rGiKvYvtf");
	WebElement nxt = driver.findElement(By.xpath("//input[@value='Next']"));
	  nxt.click(); 
	
	  Thread.sleep(2000);
	WebElement entry2 = driver.findElement(By.xpath("//input[@name='fieldvalue[2559][]']"));
	entry2.sendKeys("l8osWZYbO");
	nxt.click();
	
	Thread.sleep(2000);
	WebElement entry3 = driver.findElement(By.xpath("//input[@name='fieldvalue[2560][]']"));
	entry3.sendKeys("033586.49");
	nxt.click();
	
	Thread.sleep(2000);
	WebElement entry4 = driver.findElement(By.xpath("//input[@name='fieldvalue[2561][]']"));
	entry4.sendKeys("9Mthw6cZq");
	nxt.click();
	
	Thread.sleep(2000);
	WebElement entry5 = driver.findElement(By.xpath("//input[@name='fieldvalue[2562][]']"));
	entry5.sendKeys("e8H$x@R44"); 
	nxt.click();
	
	Thread.sleep(2000);
	WebElement entry6 = driver.findElement(By.xpath("//input[@name='fieldvalue[2563][]']"));
	entry6.sendKeys("$xy!g0B3L");
	nxt.click();
	
	Thread.sleep(2000);
	WebElement entry7 = driver.findElement(By.xpath("//input[@name='fieldvalue[2564][]']"));
	entry7.sendKeys("822380090592.3");
	nxt.click();
	
	Thread.sleep(2000);
	WebElement entry8 = driver.findElement(By.xpath("//input[@name='fieldvalue[2565][]']"));
	entry8.sendKeys("998321666821");
	nxt.click();
	
	Thread.sleep(2000);
	WebElement entry9 = driver.findElement(By.xpath("//input[@name='fieldvalue[2566][]']"));
	entry9.sendKeys("80fDlc@5m");
	nxt.click();
	
	Thread.sleep(2000);
	WebElement entry10 = driver.findElement(By.xpath("//input[@name='fieldvalue[2567][]']"));
	entry10.sendKeys("26733.12");
	WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));
	submit.click(); 
	
	System.out.println("Task Completed");
	
	driver.close();
	
	
	
	
	
	}
	}
	