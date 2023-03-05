package Test;

 

 

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

 

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

 

import Base.BaseUI;
import Utils.ExtentReport;

 


public class TestClass extends BaseUI {

    ExtentReports report = ExtentReport.getReportInstance();

    @Test 
    public void testOne() throws InterruptedException, IOException {
           ExtentTest logger = report.createTest("INNER JOIN");



           logger.log(Status.INFO, "Initializing the Browser.");
           invokeBrowser("edge");



           logger.log(Status.INFO, "Opening the Database URL.");
           OpenURL("URL");
           //driver.get("https://www.mycompiler.io/new/sql");
           Compiler("Compiler");
           //driver.findElement(By.xpath("//textarea[@class ='ace_text-input']"));
           Actions action = new Actions(driver);
           action.click(driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")))
           .keyDown(Keys.CONTROL)
           .sendKeys("a")
           .keyUp(Keys.CONTROL)
           .sendKeys(Keys.BACK_SPACE)
           .build()
           .perform();


           //CREATING TABLE EMPLOYEE
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']"))
           .sendKeys("create table employee(emp_id int primary key,last_name char(20),first_name char(20),hire_date varchar,job_title char);");
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12345','Das' ,'Arnab', '26/05/2021','PAT'); INSERT INTO employee VALUES ('12346','Kumar' ,'Anil', '25/09/2022','PAT');");
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12347','Yadav' ,'Anurag', '12/06/2022','Project manager'); INSERT INTO employee VALUES ('12348','Das' ,'Amal', '31/07/2020','project manager');");
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12349','Ghosh' ,'Tamalika', '21/04/2019','PAT'); INSERT INTO employee VALUES ('12350','Saha' ,'priya', '14/05/2022','Project associate');");
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12351','Roy' ,'Ritam', '12/08/2022','PAT'); INSERT INTO employee VALUES ('12352','Yadav' ,'Riya', '11/06/2018','Project associate');");
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12353','Kumari' ,'Deepali', '13/04/2022','PAT'); INSERT INTO employee VALUES ('12354','Guriya' ,'Anisha', '14/05/2022','PAT');");
           //CREATING TABLE EMPLOYER

           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("CREATE TABLE employer (id INTEGER PRIMARY KEY,last_name char(20),first_name TEXT NOT NULL,department char(20),location TEXT NOT NULL);");
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12330','Das' ,'Arnab', 'QEA','KOLKATA'); INSERT INTO employer VALUES ('12346','Kumar' ,'Anil', 'QEA','NOIDA');");
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12357','Yadav' ,'Anurag', 'QEA','KOLKATA'); INSERT INTO employer VALUES ('12348','Das' ,'Amal', 'QEA','BENGALORE');");
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12349','negi' ,'Tamalika', 'QEA','MUMBAI'); INSERT INTO employer VALUES ('12356','Saha' ,'priya', 'QEA','KOLKATA');");
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12359','Das' ,'Ritam', 'QEA','KOLKATA'); INSERT INTO employer VALUES ('12351','Yadav' ,'Riya', 'QEA','PUNE');");
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12366','Kumari' ,'Deepali', 'QEA','NOIDA'); INSERT INTO employer VALUES ('12355','prasad' ,'Anisha', 'QEA','CHENNAI');");
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
           //INNER JOIN QUERY

           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("select employee.hire_date,employee.job_title,employer.department,employer.location");
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("from employee");
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("inner join employer");
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
           driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("on employee.emp_id=employer.id;");
           
          logger.log(Status.INFO, "Test Executed Sucessfully");
           RunBtn("RunButton");  
           
       

          



           System.out.println("INNER JOIN Sucessful");
           Thread.sleep(4000);
           
            
 //ScreenShot
           File ScreenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           FileUtils.copyFile(ScreenshotFile, new File(".//screenshot/InnerJoin.png"));




           logger.log(Status.INFO, "Test Extended Sucessfully.");

           //tearDown();

    }
    @Test(dependsOnMethods = "testOne")

    

    public void testTwo() throws InterruptedException, IOException {
        ExtentTest logger = report.createTest("LEFT JOIN");
        /*logger.log(Status.INFO, "Initializing the Browser.");
        invokeBrowser("chrome");
        logger.log(Status.INFO, "Opening the Database URL.");
        OpenURL("URL");
        Compiler("Compiler");
        Thread.sleep(2000);*/
        Actions action = new Actions(driver);
        action.click(driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")))
        .keyDown(Keys.CONTROL)
        .sendKeys("a")
        .keyUp(Keys.CONTROL)
        .sendKeys(Keys.BACK_SPACE)
        .build()
        .perform();


        //CREATING TABLE EMPLOYEE
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']"))
        .sendKeys("create table employee(emp_id int primary key,last_name char(20),first_name char(20),hire_date varchar,job_title char);");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12345','Das' ,'Arnab', '26/05/2021','PAT'); INSERT INTO employee VALUES ('12346','Kumar' ,'Anil', '25/09/2022','PAT');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12347','Yadav' ,'Anurag', '12/06/2022','Project manager'); INSERT INTO employee VALUES ('12348','Das' ,'Amal', '31/07/2020','project manager');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12349','Ghosh' ,'Tamalika', '21/04/2019','PAT'); INSERT INTO employee VALUES ('12350','Saha' ,'priya', '14/05/2022','Project associate');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12351','Roy' ,'Ritam', '12/08/2022','PAT'); INSERT INTO employee VALUES ('12352','Yadav' ,'Riya', '11/06/2018','Project associate');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12353','Kumari' ,'Deepali', '13/04/2022','PAT'); INSERT INTO employee VALUES ('12354','Guriya' ,'Anisha', '14/05/2022','PAT');");
        //CREATING TABLE EMPLOYER

        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("CREATE TABLE employer (id INTEGER PRIMARY KEY,last_name char(20),first_name TEXT NOT NULL,department char(20),location TEXT NOT NULL);");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12330','Das' ,'Arnab', 'QEA','KOLKATA'); INSERT INTO employer VALUES ('12346','Kumar' ,'Anil', 'QEA','NOIDA');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12357','Yadav' ,'Anurag', 'QEA','KOLKATA'); INSERT INTO employer VALUES ('12348','Das' ,'Amal', 'QEA','BENGALORE');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12349','negi' ,'Tamalika', 'QEA','MUMBAI'); INSERT INTO employer VALUES ('12356','Saha' ,'priya', 'QEA','KOLKATA');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12359','Das' ,'Ritam', 'QEA','KOLKATA'); INSERT INTO employer VALUES ('12351','Yadav' ,'Riya', 'QEA','PUNE');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12366','Kumari' ,'Deepali', 'QEA','NOIDA'); INSERT INTO employer VALUES ('12355','prasad' ,'Anisha', 'QEA','CHENNAI');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        //LEFT JOIN QUERY

        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("select employee.hire_date,employer.department");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("from employee");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("left join employer");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("on employee.emp_id=employer.id;");
        
      
        
        logger.log(Status.INFO, "Test Executed Sucessfully");
        RunBtn("RunButton");
        System.out.println("LEFT JOIN Sucessful");
        Thread.sleep(4000);
        
        //ScreenShot
        File ScreenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenshotFile, new File(".//screenshot/LeftJoin.png"));
        
        
        logger.log(Status.INFO, "Test Extended Sucessfully.");
        //tearDown();
    }
    @Test(dependsOnMethods = "testTwo")

    

    public void testThree() throws InterruptedException, IOException {
        ExtentTest logger = report.createTest("ORDER BY");
        /*logger.log(Status.INFO, "Initializing the Browser.");
        invokeBrowser("chrome");
        logger.log(Status.INFO, "Opening the Database URL.");
        OpenURL("URL");
        Compiler("Compiler");
        Thread.sleep(2000);*/
        Actions action = new Actions(driver);
        action.click(driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")))
        .keyDown(Keys.CONTROL)
        .sendKeys("a")
        .keyUp(Keys.CONTROL)
        .sendKeys(Keys.BACK_SPACE)
        .build()
        .perform();


        //CREATING TABLE EMPLOYEE
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']"))
        .sendKeys("create table employee(emp_id int primary key,last_name char(20),first_name char(20),hire_date varchar,job_title char);");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12345','Das' ,'Arnab', '26/05/2021','PAT'); INSERT INTO employee VALUES ('12346','Kumar' ,'Anil', '25/09/2022','PAT');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12347','Yadav' ,'Anurag', '12/06/2022','Project manager'); INSERT INTO employee VALUES ('12348','Das' ,'Amal', '31/07/2020','project manager');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12349','Ghosh' ,'Tamalika', '21/04/2019','PAT'); INSERT INTO employee VALUES ('12350','Saha' ,'priya', '14/05/2022','Project associate');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12351','Roy' ,'Ritam', '12/08/2022','PAT'); INSERT INTO employee VALUES ('12352','Yadav' ,'Riya', '11/06/2018','Project associate');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12353','Kumari' ,'Deepali', '13/04/2022','PAT'); INSERT INTO employee VALUES ('12354','Guriya' ,'Anisha', '14/05/2022','PAT');");
        //CREATING TABLE EMPLOYER

        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("CREATE TABLE employer (id INTEGER PRIMARY KEY,last_name char(20),first_name TEXT NOT NULL,department char(20),location TEXT NOT NULL);");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12330','Das' ,'Arnab', 'QEA','KOLKATA'); INSERT INTO employer VALUES ('12346','Kumar' ,'Amal', 'QEA','NOIDA');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12357','Yadav' ,'Anurag', 'QEA','KOLKATA'); INSERT INTO employer VALUES ('12348','Das' ,'Anil', 'QEA','BENGALORE');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12349','negi' ,'Tamalika', 'QEA','MUMBAI'); INSERT INTO employer VALUES ('12356','Saha' ,'priya', 'QEA','KOLKATA');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12359','Das' ,'Ritam', 'QEA','KOLKATA'); INSERT INTO employer VALUES ('12351','Yadav' ,'Riya', 'QEA','PUNE');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12366','Kumari' ,'Deepali', 'QEA','NOIDA'); INSERT INTO employer VALUES ('12355','prasad' ,'Anisha', 'QEA','CHENNAI');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        //ORDER BY QUERY

        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("SELECT id,location");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("FROM employer");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("ORDER BY id;");
        
      

        logger.log(Status.INFO, "Test Executed Sucessfully");
        RunBtn("RunButton");

        System.out.println("ORDER BY Sucessful");
        Thread.sleep(4000);
        
        //ScreenShot
        File ScreenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenshotFile, new File(".//screenshot/OrderBy.png"));
        
        logger.log(Status.INFO, "Test Extended Sucessfully.");
        //tearDown();
    }
    @Test(dependsOnMethods = "testThree")
    public void testFour() throws InterruptedException, IOException {
        ExtentTest logger = report.createTest("SUB QUERY");
        /*logger.log(Status.INFO, "Initializing the Browser.");
        invokeBrowser("chrome");
        logger.log(Status.INFO, "Opening the Database URL.");
        OpenURL("URL");
        Compiler("Compiler");
        Thread.sleep(2000);*/
        Actions action = new Actions(driver);
        action.click(driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")))
        .keyDown(Keys.CONTROL)
        .sendKeys("a")
        .keyUp(Keys.CONTROL)
        .sendKeys(Keys.BACK_SPACE)
        .build()
        .perform();

        //CREATING TABLE EMPLOYEE
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']"))
        .sendKeys("create table employee(emp_id int primary key,last_name char(20),first_name char(20),hire_date varchar,job_title char);");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12345','Das' ,'Arnab', '26/05/2021','PAT'); INSERT INTO employee VALUES ('12346','Kumar' ,'Amal', '25/09/2022','PAT');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12347','Yadav' ,'Anurag', '12/06/2022','Project manager'); INSERT INTO employee VALUES ('12348','Das' ,'Anil', '31/07/2020','project manager');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12349','Ghosh' ,'Tamalika', '21/04/2019','PAT'); INSERT INTO employee VALUES ('12350','Saha' ,'priya', '14/05/2022','Project associate');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12351','Roy' ,'Ritam', '12/08/2022','PAT'); INSERT INTO employee VALUES ('12352','Yadav' ,'Riya', '11/06/2018','Project associate');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12353','Kumari' ,'Deepali', '13/04/2022','PAT'); INSERT INTO employee VALUES ('12354','Guriya' ,'Anisha', '14/05/2022','PAT');");
        //CREATING TABLE EMPLOYER

        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("CREATE TABLE employer (id INTEGER PRIMARY KEY,last_name char(20),first_name TEXT NOT NULL,department char(20),location TEXT NOT NULL);");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12330','Das' ,'Arnab', 'QEA','KOLKATA'); INSERT INTO employer VALUES ('12346','Kumar' ,'Amal', 'QEA','NOIDA');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12357','Yadav' ,'Anurag', 'QEA','KOLKATA'); INSERT INTO employer VALUES ('12348','Das' ,'Anil', 'QEA','BENGALORE');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12349','negi' ,'Tamalika', 'QEA','MUMBAI'); INSERT INTO employer VALUES ('12356','Saha' ,'priya', 'QEA','KOLKATA');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12359','Das' ,'Ritam', 'QEA','KOLKATA'); INSERT INTO employer VALUES ('12351','Yadav' ,'Riya', 'QEA','PUNE');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12366','Kumari' ,'Deepali', 'QEA','NOIDA'); INSERT INTO employer VALUES ('12355','prasad' ,'Anisha', 'QEA','CHENNAI');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        //SUB QUERY
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("SELECT first_name,last_name");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("FROM employee where emp_id IN");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("(SELECT id FROM employer WHERE department='QEA');");
        
      

        Thread.sleep(3000);
        logger.log(Status.INFO, "Test Executed Sucessfully");
        RunBtn("RunButton");
        System.out.println("SUBQUERY Sucessful");
        Thread.sleep(4000);
        
        //ScreenShot
        File ScreenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenshotFile, new File(".//screenshot/SubQuery.png"));
        
        logger.log(Status.INFO, "Test Extended Sucessfully.");
        //tearDown();
    }
    @Test(dependsOnMethods = "testFour")
    public void testFive() throws InterruptedException, IOException {
        ExtentTest logger = report.createTest("GROUP BY");
        /*logger.log(Status.INFO, "Initializing the Browser.");
        invokeBrowser("chrome");
        logger.log(Status.INFO, "Opening the Database URL.");
        OpenURL("URL");
        Compiler("Compiler");
        Thread.sleep(2000);*/
        Actions action = new Actions(driver);
        action.click(driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")))
        .keyDown(Keys.CONTROL)
        .sendKeys("a")
        .keyUp(Keys.CONTROL)
        .sendKeys(Keys.BACK_SPACE)
        .build()
        .perform();

        //CREATING TABLE EMPLOYEE
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']"))
        .sendKeys("create table employee(emp_id int primary key,last_name char(20),first_name char(20),hire_date varchar,job_title char);");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12345','Das' ,'Arnab', '26/05/2021','PAT'); INSERT INTO employee VALUES ('12346','Kumar' ,'Amal', '25/09/2022','PAT');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12347','Yadav' ,'Anurag', '12/06/2022','Project manager'); INSERT INTO employee VALUES ('12348','Das' ,'Anil', '31/07/2020','project manager');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12349','Ghosh' ,'Tamalika', '21/04/2019','PAT'); INSERT INTO employee VALUES ('12350','Saha' ,'priya', '14/05/2022','Project associate');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12351','Roy' ,'Ritam', '12/08/2022','PAT'); INSERT INTO employee VALUES ('12352','Yadav' ,'Riya', '11/06/2018','Project associate');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employee VALUES ('12353','Kumari' ,'Deepali', '13/04/2022','PAT'); INSERT INTO employee VALUES ('12354','Guriya' ,'Anisha', '14/05/2022','PAT');");
        //CREATING TABLE EMPLOYER

        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("CREATE TABLE employer (id INTEGER PRIMARY KEY,last_name char(20),first_name TEXT NOT NULL,department char(20),location TEXT NOT NULL);");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12330','Das' ,'Arnab', 'QEA','KOLKATA'); INSERT INTO employer VALUES ('12346','Kumar' ,'Amal', 'QEA','NOIDA');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12357','Yadav' ,'Anurag', 'QEA','KOLKATA'); INSERT INTO employer VALUES ('12348','Das' ,'Anil', 'QEA','BENGALORE');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12349','negi' ,'Tamalika', 'QEA','MUMBAI'); INSERT INTO employer VALUES ('12356','Saha' ,'priya', 'QEA','KOLKATA');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12359','Das' ,'Ritam', 'QEA','KOLKATA'); INSERT INTO employer VALUES ('12351','Yadav' ,'Riya', 'QEA','PUNE');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("INSERT INTO employer VALUES ('12366','Kumari' ,'Deepali', 'QEA','NOIDA'); INSERT INTO employer VALUES ('12355','prasad' ,'Anisha', 'QEA','CHENNAI');");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        //GROUP BY QUERY
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("select location,count(*)");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("FROM employer");
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@class ='ace_text-input']")).sendKeys("GROUP BY location;");
        Thread.sleep(2000);
        
      
        
        logger.log(Status.INFO, "Test Executed Sucessfully");
        RunBtn("RunButton");
        System.out.println("GROUP BY Sucessful");
        Thread.sleep(4000);
        
        //ScreenShot
        File ScreenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenshotFile, new File(".//screenshot/GroupBy.png"));
        
        logger.log(Status.INFO, "Test Extended Sucessfully.");
        tearDown();
    }
    @AfterTest
    public void endReport(){
        report.flush();

    }

 

}