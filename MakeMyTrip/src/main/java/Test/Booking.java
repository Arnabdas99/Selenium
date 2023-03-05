package Test;
 
import com.aventstack.extentreports.ExtentReports;
 
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
//import java.util.concurrent.TimeUnit;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
 
 

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
 
import base.baseUI;
import Utils.ExtentReport;
 
 
public class Booking extends baseUI {
    ExtentReports report = ExtentReport.getReportInstance();


    @Test
    public void testOne() throws InterruptedException, IOException {
        ExtentTest logger = report.createTest("Flight booking page");
 

//driver
        logger.log(Status.INFO, "Initializing the Browser.");
        invokeBrowser("edge");
  //URL      
        logger.log(Status.INFO, "Opening the Make My Trip URL.");
        OpenURL("URL");
        //Thread.sleep(1000);
        
       
        //From
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        
        //driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.cssSelector("input[class='react-autosuggest__input react-autosuggest__input--open']"));
        String OptionToSelect= prop.getProperty("From");
        int count=0;
        driver.findElement(By.id("fromCity")).sendKeys(prop.getProperty("From"));
        Thread.sleep(3000);
        List<WebElement> optionList=driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li"));
        for(WebElement ele:optionList) {
            String currentOption=ele.getText();

            if(currentOption.contains(OptionToSelect)) {
                ele.click();
                count++;
                break;
            }
        }
        if(count!=0) {
            System.out.println(OptionToSelect+" has been selected");
            logger.log(Status.INFO, "From City has been selected");

        }
        else
            System.out.println("nothing in the list");

        //To
        String ToSelect= prop.getProperty("To");
        int flag=0;
        driver.findElement(By.id("toCity")).sendKeys(prop.getProperty("To"));
        Thread.sleep(3000);
        List<WebElement> optList=driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li"));
        for(WebElement ele:optList) {
            String currentOption=ele.getText();

            if(currentOption.contains(ToSelect)) {
                ele.click();
                flag++;
                break;
            }
        }
        if(count!=0) {
            System.out.println(ToSelect+" has been selected");
            logger.log(Status.INFO, "To city has been selected");

        }
        else
            System.out.println("nothing in the list");
        driver.findElement(By.cssSelector("span[class='ic_circularclose_grey']")).click();
        Thread.sleep(10);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)","");
        //departure date
        String f= "False";
        while(f=="False") {
            if(driver.findElements(By.xpath(prop.getProperty("DepartureDate") )).size()>0) {
                driver.findElement(By.xpath(prop.getProperty("DepartureDate") )).click();
                f="True";
            }
            else {
                driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
            }
        }
        System.out.println("Departure Date is entered successfully");
        logger.log(Status.INFO, "Departure Date is entered successfully");
        //driver.findElement(By.xpath(prop.getProperty("DepartureDate") )).click();
        Thread.sleep(2000);

        //return date
        driver.findElement(By.xpath("(//span[@class='lbl_input latoBold appendBottom10'])[2]")).click();
        String g="False";
        while(g=="False") {
            if(driver.findElements(By.xpath(prop.getProperty("ReturnDate"))).size()>0) {
                driver.findElement(By.xpath(prop.getProperty("ReturnDate"))).click();
                g="True";
            }
        }
        System.out.println("Return Date is entered successfully");
        logger.log(Status.INFO, "Return Date is entered successfully");
        Thread.sleep(2000);

        //search
        driver.findElement(By.cssSelector("a[class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//button[@class='button buttonSecondry buttonBig fontSize12 relative']")).click();
        //Thread.sleep(6000);

        //ScreenShot
        File ScreenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenshotFile, new File(".//screenshot/screen.png"));


        System.out.println("Screenshot is taken sucessfully");
        logger.log(Status.INFO, "Screenshot is taken sucessfully");
 
}

    @AfterTest
    public void close() {
        quitBrowser();
    }
 
    

@AfterTest
public void endReport(){
    report.flush();
    }
}
