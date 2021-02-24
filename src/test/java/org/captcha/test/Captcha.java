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
	
	WebElement entry1 = driver.findElement(By.xpath("//input[@name='fieldvalue[2548][]']"));
	entry1.sendKeys("vxQ4NAavZ");
	WebElement nxt = driver.findElement(By.xpath("//input[@value='Next']"));
	  nxt.click(); 
	
	  Thread.sleep(2000);
	WebElement entry2 = driver.findElement(By.xpath("//input[@name='fieldvalue[2549][]']"));
	entry2.sendKeys("YRYlSK3ck");
	nxt.click();
	
	Thread.sleep(2000);
	WebElement entry3 = driver.findElement(By.xpath("//input[@name='fieldvalue[2550][]']"));
	entry3.sendKeys("imDZVi6FD");
	nxt.click();
	
	Thread.sleep(2000);
	WebElement entry4 = driver.findElement(By.xpath("//input[@name='fieldvalue[2551][]']"));
	entry4.sendKeys("524508");
	nxt.click();
	
	Thread.sleep(2000);
	WebElement entry5 = driver.findElement(By.xpath("//input[@name='fieldvalue[2552][]']"));
	entry5.sendKeys("1780740.36"); 
	nxt.click();
	
	Thread.sleep(2000);
	WebElement entry6 = driver.findElement(By.xpath("//input[@name='fieldvalue[2553][]']"));
	entry6.sendKeys("4980131981.83");
	nxt.click();
	
	Thread.sleep(2000);
	WebElement entry7 = driver.findElement(By.xpath("//input[@name='fieldvalue[2554][]']"));
	entry7.sendKeys("EyfoWFgzN");
	nxt.click();
	
	Thread.sleep(2000);
	WebElement entry8 = driver.findElement(By.xpath("//input[@name='fieldvalue[2555][]']"));
	entry8.sendKeys("Ahvfw@QA9");
	nxt.click();
	
	Thread.sleep(2000);
	WebElement entry9 = driver.findElement(By.xpath("//input[@name='fieldvalue[2556][]']"));
	entry9.sendKeys("96432049508.02");
	nxt.click();
	
	Thread.sleep(2000);
	WebElement entry10 = driver.findElement(By.xpath("//input[@name='fieldvalue[2557][]']"));
	entry10.sendKeys("3026184.26");
	WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));
	submit.click(); 
	
	System.out.println("Task Completed");
	
	driver.close();
	
	
	
	
	
	}
	}
	