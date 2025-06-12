package listeners;

import java.text.SimpleDateFormat;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.util.Date;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManger 
  {
	public static ExtentReports extent;

	public static ExtentReports getInstance() {

		if (extent == null) {
			extent = createInstance();
			return extent;
		} else {
			return extent;
		}
	}

	static String rname;

	public static ExtentReports createInstance()
	{
		 String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		   rname="DemoBlaze"+timestamp+".html";
		
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/"+rname);
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("DemoBlazeReport");
		sparkReporter.config().setDocumentTitle("DemoBlaze");
	
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		return extent;
	
	}

  }

	