package org.testdefinition;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Searchdefinition {
	static WebDriver driver;	
	@Given("user has to be there in catch website")
	public void user_has_to_be_there_in_catch_website() {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\navee.DESKTOP-ND11BA1\\eclipse-workspace\\Ecommerce\\Drive\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.catch.com.au/");
	}

	@When("user has to {string} the products")
	public void user_has_to_the_products(String s1) {
		WebElement search = driver.findElement(By.id("search-input"));
	    search.sendKeys(s1);
	}

	@When("user has to click serach button")
	public void user_has_to_click_serach_button() throws InterruptedException {
		WebElement btnclick = driver.findElement(By.id("search"));
		btnclick.click();	
		Thread.sleep(5000);
		List<WebElement> searchresults = driver.findElements(By.xpath("//div[@class='product']"));
		  for (WebElement Links : searchresults) {
			System.out.println(Links.getText());
		  }
	}

	@Then("user has to see the search results")
	public void user_has_to_see_the_search_results() {
	  
		}

}
