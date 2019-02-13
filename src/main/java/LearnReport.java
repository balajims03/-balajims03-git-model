 import java.io.IOException;
        import com.aventstack.extentreports.ExtentReports;
        import com.aventstack.extentreports.ExtentTest;
        import com.aventstack.extentreports.MediaEntityBuilder;
        import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

        public class LearnReport {
        	public static void main(String[] args) throws IOException {
        //TestSuite	
        		ExtentHtmlReporter html= new ExtentHtmlReporter("./reports//result.html");
        		ExtentReports extent= new ExtentReports();
        		extent.attachReporter(html);
        //TC
        		ExtentTest test= extent.createTest("Login", "Login to leaftaps");
        		test.assignAuthor("Rahul");
        		test.assignCategory("smoke");
        //SYSOut
        		test.pass("username entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img.png").build());
        		test.pass("password entered successfully");
        		test.pass("login clicked successfully");
        //AS	
        		extent.flush();


        	}
        }
