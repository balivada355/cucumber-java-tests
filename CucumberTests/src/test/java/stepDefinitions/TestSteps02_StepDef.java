package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resources.pageObjects.WelcomePage;
import resources.utils.BaseUtils;

public class TestSteps02_StepDef  {
	private BaseUtils bu;
	public TestSteps02_StepDef(BaseUtils bu){
		this.bu = bu;
	}
	
	@When("user enters username and Password")
	public void user_enters_username_and_Password() {
//		bu.getTc().setDriver(new ChromeDriver()) ;
	    System.out.println("User enters username and password");
		System.out.println("USer is on Login Page");
		System.out.println("Driver used is" + bu.getTc().getDriver());
	}

	@Then("success message is displayed")
	public void success_message_is_displayed() {
	    System.out.println("Success message is displayed");
	    System.out.println("USer is on Welcome Page");
	    WelcomePage wp = new WelcomePage(bu.getTc().getDriver());
	    System.out.println(wp.toString());
	    System.out.println("Driver used is" + bu.getTc().getDriver());
	}


}
