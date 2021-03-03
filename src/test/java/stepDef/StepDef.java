package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef{
	WebDriver driver;

	
	
	@Given("User is on homepage")
	public void user_is_on_homepage() {
					System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\shano\\eclipse-workspace\\Captcha\\drivers\\chromedriver.exe");
			
				driver = new ChromeDriver();
				
				driver.get("https://www.onlinedataentryjob.com/form-filling-work.php");
				driver.manage().window().maximize();
	}

	@When("Enter the {string} and {string}")
	public void enter_the_and(String string, String string2) throws InterruptedException {
		WebElement loginOpt = driver.findElement(By.xpath("//strong[text()='Login']"));
		loginOpt.click();
		
		WebElement dUser = driver.findElement(By.name("user_name"));
		dUser.sendKeys(string);
		
		WebElement dPass = driver.findElement(By.name("password"));
		dPass.sendKeys(string2);
		
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
	    
	}

	@Then("Data entry page")
	public void data_entry_page() throws InterruptedException {
		
		WebElement entry1 = driver.findElement(By.xpath("//input[@name='fieldvalue[2618][]']"));
		entry1.sendKeys("747105415865");
		WebElement nxt = driver.findElement(By.xpath("//input[@value='Next']"));
		  nxt.click(); 
		
		  Thread.sleep(2000);
		WebElement entry2 = driver.findElement(By.xpath("//input[@name='fieldvalue[2619][]']"));
		entry2.sendKeys("CaZ4D@kKB");
		nxt.click();
		
		Thread.sleep(2000);
		WebElement entry3 = driver.findElement(By.xpath("//input[@name='fieldvalue[2620][]']"));
		entry3.sendKeys("48755461");
		nxt.click();
		
		Thread.sleep(2000);
		WebElement entry4 = driver.findElement(By.xpath("//input[@name='fieldvalue[2621][]']"));
		entry4.sendKeys("7fikM5PJm");
		nxt.click();
		
		Thread.sleep(2000);
		WebElement entry5 = driver.findElement(By.xpath("//input[@name='fieldvalue[2622][]']"));
		entry5.sendKeys("88895164322.53"); 
		nxt.click();
		
		Thread.sleep(2000);
		WebElement entry6 = driver.findElement(By.xpath("//input[@name='fieldvalue[2623][]']"));
		entry6.sendKeys("goaJhycce");
		nxt.click();
		
		Thread.sleep(2000);
		WebElement entry7 = driver.findElement(By.xpath("//input[@name='fieldvalue[2624][]']"));
		entry7.sendKeys("1fv6dkwwe");
		nxt.click();
		
		Thread.sleep(2000);
		WebElement entry8 = driver.findElement(By.xpath("//input[@name='fieldvalue[2625][]']"));
		entry8.sendKeys("ALfStGeuw");
		nxt.click();
		
		Thread.sleep(2000);
		WebElement entry9 = driver.findElement(By.xpath("//input[@name='fieldvalue[2626][]']"));
		entry9.sendKeys("fKc2Beq0T");
		nxt.click();
		
		Thread.sleep(2000);
		WebElement entry10 = driver.findElement(By.xpath("//input[@name='fieldvalue[2627][]']"));
		entry10.sendKeys("0227541.72");
		WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));
		submit.click(); 
	    
	}

	@Then("Close the Browser {string} ")
	public void close_the_Browser(String string) {
		System.out.println(string+"Task Completed");
		
		driver.close();
		
	   
	}

	
	
}