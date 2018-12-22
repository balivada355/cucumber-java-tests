package resources.pageObjects;

import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {

	public static final String pageName= "LoginPage";
	public LoginPage(WebDriver driver) {
		super(pageName, driver);
	}

}
