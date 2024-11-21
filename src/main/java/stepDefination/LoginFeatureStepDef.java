package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginFeatureStepDef {
	
	private final WebDriver driver = new ChromeDriver();
	
	@Given("user navigates to the Website javatpoint.com")
	public void user_navigates_to_the_website_javatpoint_com() {
		
        driver.get("https://qauatoldui.slashrtc.in");
        driver.manage().window().maximize();
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("there user logs in through Login Window by using Username as {string} and Password as {string}")
	public void there_user_logs_in_through_login_window_by_using_username_as_and_password_as(String string, String string2) throws InterruptedException {
	    
		driver.findElement(By.name("username")).sendKeys("slashadmin");
		System.out.println("we have put the username field");
		Thread.sleep(100);
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		System.out.println("we have put the username field");
		Thread.sleep(100);
		driver.findElement(By.id("loginProcess")).click();
		System.out.println("we have put the password field");
		Thread.sleep(100);
		driver.findElement(By.linkText("Campaigns")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Campaigns'])[2]/following::button[1]")).click();
		Thread.sleep(100);
		driver.findElement(By.linkText("Campaign Create")).click();
		Thread.sleep(100);
			driver.findElement(By.id("normal-field")).sendKeys("Campaigntest3");
			Thread.sleep(100);
			driver.findElement(By.xpath("//div[@id='main-wrapper']/div/div/div/div[2]/form/div[2]/input")).sendKeys("Campaigntest3");
			Thread.sleep(100);
			driver.findElement(By.name("client")).sendKeys("Vodafone");
			Thread.sleep(100);
			driver.findElement(By.xpath("//div[@id='main-wrapper']/div/div/div/div[2]/form/div[4]/span/span/span/ul")).click();
			Thread.sleep(100);
			System.out.println("AutoSupervisorTesting");
			WebElement supervisor=driver.findElement(By.id("select2"));
			Select Supr = new Select(supervisor);
			Supr.selectByVisibleText("autoSupervisor Testing ( autoSupervisor )");
		// Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("loginout must be successful.")
	public void login_must_be_successful() throws InterruptedException {
		
		driver.findElement(By.xpath("//img[contains(@src,'https://qauatoldui.slashrtc.in/assets/images/alphabets/alphabet_S.png')]")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(500);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}


}
