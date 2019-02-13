package Annotations.java;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class  extends NewTest {
 
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
		startApp("chrome", "http://leaftaps.com/opentaps/");
		WebElement eleUsername = locateElement("id", "USERNAME");
		clearAndType(eleUsername, "DemoSalesManager");
		locateElement("id", "password");
        clearAndType(locateElement("id", "password"), "crmsfa");       
        click(locateElement("class", "decorativeSubmit"));  
        
	}


	  		
	  		
  }

  @AfterMethod
  public void afterMethod()
 
  {close();
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
