package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage extends LoginPage {
@FindBy(how=How.LINK_TEXT, using="CRMSFA") private WebElement elecrmsfa;
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")private WebElement elelogout;
	public MyHome clickcrmsfa() {
		click(elecrmsfa);
		return new MyHome();
		
	}
	public LoginPage clicklogout() {
		click(elelogout);
		return new LoginPage();
		
	}
	
}
