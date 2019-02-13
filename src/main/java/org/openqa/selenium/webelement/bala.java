

import java.text.Annotation;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class bala extends Annotation {

	
		@Test
		public void login()
		{
		startApp("chrome", "http://leaftaps.com/opentaps/");
		WebElement eleusername=locateElement("id","username");
		clearAndType(eleusername,"demoslesmanager");
		clearAndType(locateElement("id","password"),"crmsfa");
	    click(locateelement("class","decorativesubmit"));
	    click(locateelement("class","decrotivesubmit"));
	}
		
		

}
