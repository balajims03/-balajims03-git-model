import java.io.IOException;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class result1 {

	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter html=new ExtentHtmlReporter("./reports//result.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test=extent.createTest("login","login to leaftaps");
		test.assignAuthor("balaji");
		test.assignCategory("smoke");
		test.pass("username entered successfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img.png").build());
		test.pass("password entered successfully");
		test.pass("login clicked successfully");
		extent.flush();		

	}

}
