package org.captcha.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class Earnings {
	
	
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
	
	
	
	
	
	
	}
	}
	