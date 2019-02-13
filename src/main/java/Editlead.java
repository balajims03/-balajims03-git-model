
import org.openqa.yalla.base.Annotations;
import org.testng.annotations.Test;

public class Editlead extends Annotations
{ 
   @Test
	public void editlead() throws InterruptedException{
		click(locateElement("xpath","//a[text()='Leads']"));
		click(locateElement("xpath","//a[[text()='Findleads']"));
		click(locateElement("xpath","//span[text()='Email']"));
		clearAndType(locateElement("xpath","//input[@name='emailaddress']"),"noneemail.com");
		click(locateElement("xpath","//button[text()='findleads']"));
		Thread.sleep(3000);
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId"));
		clearAndType(locateElement("id","updateLeadForm_companyName"));
		click(locateElement("class","smallsubmit"));

}
}
