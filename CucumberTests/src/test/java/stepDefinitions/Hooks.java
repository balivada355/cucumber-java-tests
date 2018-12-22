package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import resources.utils.BaseUtils;

public class Hooks  {
	
	private BaseUtils bu;
	public Hooks(BaseUtils bu){
		this.bu = bu;
	}
	
	
	
	@Before
	public void beforeScenario()
	{
		WebDriver driver = new FirefoxDriver();
		bu.getTc().setDriver(driver);
		
		System.out.println("-------------------------------------------\n");
		
	}
	
	@After
	public void afterScenario()
	{
		WebDriver driver = bu.getTc().getDriver();
//		driver.close();
		driver.quit();
		System.out.println("===========================================\n");
	}
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
		
	}
	
	@AfterStep
	public void afterStep()
	{
		System.out.println("**************************************************\n");
	}
	

}
