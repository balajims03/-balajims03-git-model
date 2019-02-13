package org.openqa.yalla.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.yalla.base.SeleniumBase;
import org.testng.annotations.Test;

public class Login extends SeleniumBase{

	@Test
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps/");
		WebElement eleUsername = locateElement("id", "USERNAME");
		clearAndType(eleUsername, "DemoSalesManager");
		locateElement("id", "password");
        clearAndType(locateElement("id", "password"), "crmsfa");       
        click(locateElement("class", "decorativeSubmit"));  
        click(locateElement("class", "decorativeSubmit"));
	}
}




