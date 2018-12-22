package resources.utils;

import org.openqa.selenium.WebDriver;

public class TestContext {
	private  WebDriver driver = null;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
