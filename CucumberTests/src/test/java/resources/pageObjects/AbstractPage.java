package resources.pageObjects;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
  private String pageName;
  public String toString()   
  {
	return "This is a page with name " + pageName;
	  
  }
  
  public AbstractPage(String pageName, WebDriver driver)
  {
	  this.pageName = pageName;
  }
  
}
