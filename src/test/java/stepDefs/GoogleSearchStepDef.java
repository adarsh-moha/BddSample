package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class GoogleSearchStepDef {


	WebDriver driver;
		@Given("I launched google page")
		public void i_launched_google_page() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			Assert.assertTrue(true);
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
		}


		@When("I search {string} tutorial")
		public void i_search_tutorial(String string)  {
			WebElement element=driver.findElement(By.name("q"));
			element.clear();
			element.sendKeys(string);
			element.submit();
			Assert.assertTrue(true);
			
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
		}
		
		@Then("shoud display result page")
		public void shoud_display_result_page() {
			Assert.assertEquals("java - Google Search",driver.getTitle());

		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
		}
		
		@Then("close browser")
		public void close_browser() {
			driver.close();
			//Assert.assertTrue(false);
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
		}



}
