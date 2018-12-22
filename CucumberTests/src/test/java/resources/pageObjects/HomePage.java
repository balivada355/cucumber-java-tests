package resources.pageObjects;

import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {
    public static final String pageName= "HomePage";
	public HomePage(WebDriver driver) {
		super(pageName, driver);
	}

}
