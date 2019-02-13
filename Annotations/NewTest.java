package create lead;
import org.openqa.yalla.testcases;
import org.testng.annotations.Dataprovider;

public class NewTest extends Annotations {
  @Test(dataprovider="data")
  public void create(string cname,string dname,string ename)
        create(locateElement("link", "Leads")); 
		click(locateElement("link", "Create Lead")); 
		clearAndType(locateElement("id", "createLeadForm_companyName"), "testleaf");
		clearAndType(locateElement("id", "createLeadForm_firstName"), "balaaji");
		clearAndType(locateElement("id", "createLeadForm_lastName"), "c");
		click(locateElement("class", "smallSubmit"));
		
	
  }
n@Dataprovider(name="data")
  public object[][] senddata()
  {
	  object[]data=new object [2][3]
			  data[0][0]="testleaf";
	  data[0][1]="balaaji";
	  data[0][2]="c";
	  data[1][0]="hcl";
	  data[1][1]="koushik";
	  data[1][2]="a";
	  return data;
  }
	  
	  
  }
  
