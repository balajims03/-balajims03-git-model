package org.openqa.yalla.base;

import org.testng.annotations.Test;

public class AnnotationsTest Testextends seleniumbase {
  @Test
  public void f() {public void create() {
		
		click(locateElement("link", "Leads")); 
		click(locateElement("link", "Create Lead")); 
		clearAndType(locateElement("id", "createLeadForm_companyName"), "TL");
		clearAndType(locateElement("id", "createLeadForm_firstName"), "Loka");
		clearAndType(locateElement("id", "createLeadForm_lastName"), "c");
		click(locateElement("class", "smallSubmit"));
	}
  }
}
