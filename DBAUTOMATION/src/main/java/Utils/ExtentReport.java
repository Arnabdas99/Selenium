package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	public static ExtentReports report;
    public static ExtentReports getReportInstance(){
        if( report ==null){
            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+ "\\src\\main\\resources\\Report\\TestReport.html");
            report = new ExtentReports();
            report.attachReporter(htmlReporter);
            htmlReporter.config().setReportName("DB AUTOMATION REPORT");
            htmlReporter.config().setDocumentTitle("Automation Report");

        }
        return report;





    }

}
