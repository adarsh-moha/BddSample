package stepDefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginStepDefs {
	WebDriver driver;
	
	@Given("User is already in login page")
	public void user_is_already_in_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		Assert.assertTrue(true);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user enters login user and pass")
	public void user_enters_login_user_and_pass(DataTable table) {
		List<Map<String, String>> datas =table.asMaps();
	    driver.findElement(By.name("email")).sendKeys(datas.get(0).get("username"));
	    driver.findElement(By.name("password")).sendKeys(datas.get(0).get("password"));
	    driver.findElement(By.xpath("//*[text()='Login']")).click();
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
		assertTrue( driver.getTitle().equalsIgnoreCase("cogmento crm"));
	   
	}
	
	@AfterClass
	private void closeBrow() {
		driver.close();

	}
	

}
