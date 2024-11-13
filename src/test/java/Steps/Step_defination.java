package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_defination {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
		throw new io.cucumber.java.PendingException();
	}

	@When("the enters the valid user_name and password")
	public void the_enters_the_valid_user_name_and_password() {
      driver.findElement(By.id("email")).sendKeys("Abc@gmail.com");
      driver.findElement(By.id("pass")).sendKeys("Abc@122");
      driver.findElement(By.name("login")).click();
		throw new io.cucumber.java.PendingException();
	}

	@Then("User should be in the home page")
	public void user_should_be_in_the_home_page() {
	   String titile = driver.getTitle();
	   System.out.println(titile);
	    throw new io.cucumber.java.PendingException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
