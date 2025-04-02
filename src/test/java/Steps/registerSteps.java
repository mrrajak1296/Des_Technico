package Steps;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class registerSteps {
	WebDriver driver;
	
	@Given("User is on register page")
	public void user_is_on_register_page() {
	   driver = new ChromeDriver();
	   driver.get("https://notes-makers.vercel.app/pages/signup");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}

	@When("User enters valid details")
	public void user_enters_valid_details() {
		driver.findElement(By.id("name")).sendKeys("Anil");
		driver.findElement(By.id("email")).sendKeys("Demo@gmail.com");
		driver.findElement(By.cssSelector("[id=\"password\"]")).sendKeys("Demo@12345");
		driver.findElement(By.cssSelector("[placeholder=\"Confirm your password\"]")).sendKeys("Demo@12345");
	    
		
		
	}

	@When("User clicks on register button")
	public void user_clicks_on_register_button() {
		driver.findElement(By.xpath("(//strong[@class=\"flex items-center justify-center\"])[3]")).click();
	   
		
		
	}

	@Then("User should be redirected to loginpage")
	public void user_should_be_redirected_to_loginpage() {
		
		assert driver.getCurrentUrl().equals("https://notes-makers.vercel.app/pages/login");
		//https://notes-makers.vercel.app/pages/login


		
	}




}
