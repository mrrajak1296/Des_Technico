package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class loginSteps {
	WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver= new ChromeDriver();
		driver.get("https://notes-makers.vercel.app/pages/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
		
	}

	@When("User enter email and password")
	public void user_enter_email_and_password() {
		driver.findElement(By.id("email")).sendKeys("Demo@gmail.com");
		driver.findElement(By.cssSelector("[placeholder=\"Enter your password\"]")).sendKeys("Demo@12345");
	    
		
		
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {
		
		driver.findElement(By.xpath("(//strong[@class=\"flex items-center justify-center\"])[3]")).click();
	    
		
		
	}
	@Then("User should be redirected to HomePage")
	public void user_should_be_redirected_to_home_page() {
	    assert driver.getCurrentUrl().equals("https://notes-makers.vercel.app/pages/notes");
		
	}
	
	@When("User click on Create notebook")
	public void user_click_on_create_notebook() {
		
		driver.findElement(By.xpath("(//span[@class=\"mr-2\"])[2]")).click();
		
		
		
	}

	@When("User enter the booktitle")
	public void user_enter_the_booktitle() {
	  
		driver.findElement(By.id("title")).sendKeys("QA Team");
		
	}

	@Then("User submit the notebook")
	public void user_submit_the_notebook() {
		driver.findElement(By.xpath("(//strong[@class=\"flex items-center justify-center\"])[4]")).click();
	    
		
		
	}
	
	@Then("user click on profile")
	public void user_click_on_profile() {
	    driver.findElement(By.cssSelector(".text-primary-950.text-4xl")).click();
	}
	
	@When("user enter the Todo")
	public void user_enter_the_todo() {
	     driver.findElement(By.xpath("//li[normalize-space()='Todo']")).click();
	}
	
	@When("write the todo")
	public void write_the_todo() {
	   driver.findElement(By.cssSelector("input[placeholder='Write Todo']")).sendKeys("AB");
	}
	@Given("set the priority")
	public void set_the_priority() {
	    
		WebElement set=  driver.findElement(By.xpath("//select[contains(@class,'border-primary-950')]"));
		Select pri = new Select(set);
		pri.selectByVisibleText("High");
		
		driver.findElement(By.cssSelector("[type=\"date\"]")).sendKeys("04/02/2024");
		
		driver.findElement(By.cssSelector("[class=\"flex items-center justify-center\"]")).click();
	}






}
