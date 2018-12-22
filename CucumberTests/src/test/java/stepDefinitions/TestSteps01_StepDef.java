package stepDefinitions;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import resources.pageObjects.HomePage;
import resources.pageObjects.LoginPage;
import resources.utils.BaseUtils;

public class TestSteps01_StepDef   {
	private BaseUtils abs;
	public TestSteps01_StepDef(BaseUtils bu){
		this.abs = bu;
	}

	
	@Given("user is  on homepage")
	public void user_is_on_homepage() {	 

//	   abs.getTc().setDriver(new FirefoxDriver());
	   HomePage hp = new HomePage(abs.getTc().getDriver());	  
	   System.out.println("USer is on Home Page");
	   System.out.println(hp.toString());
	   System.out.println("Driver used is" + abs.getTc().getDriver());
	   
	}

	@When("user navigates to Login Page")
	public void user_navigates_to_Login_Page() {
		LoginPage lp = new LoginPage(abs.getTc().getDriver());
		System.out.println("USer is on Login Page");
		System.out.println(lp.toString());
		System.out.println("Driver used is" + abs.getTc().getDriver());
	}

	
}
