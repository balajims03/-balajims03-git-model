package org.openqa.yalla.base;

import org.testng.annotations.BeforeMethod;

public class Annotations extends SeleniumBase{
	@BeforeMethod
	public void launch() {
		startApp("chrome", "");
	}
	@BeforeMethod
	public void closrowser() {
		close();
	}


}
