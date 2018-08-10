package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Annotations {
	   WebDriver d = null; 
		
	   @Given("^I have open the browser$") 
	   public void openBrowser() {
		  System.setProperty("webdriver.chrome.driver", "D:\\VB\\MyWorkspace\\Driver\\chromedriver.exe");
	      d = new ChromeDriver(); 
	   } 

	   @When("^I open Easy website$") 
	   public void goToFacebook() { 
	      d.get("https://easy.techmahindra.com/EasyLogin.aspx");
	      System.out.println("app launched..");
	   } 

	   @When("^I open Google website$") 
	   public void goToGoogle() { 
	      d.get("https://easy.techmahindra.com/EasyLogin.aspx");
	      System.out.println("Google launched..");
	   } 
	   
	   
	   @Then("^Login button should exits$") 
	   public void loginButton() { 
	      if(d.findElement(By.id("u_0_v")).isEnabled()) { 
	         System.out.println("Test 1 Pass"); 
	      } else { 
	         System.out.println("Test 1 Fail"); 
	      } 
	      d.close(); 
	   }

}