package base;
 
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
 
public class baseUI {
    public WebDriver driver;
    public Properties prop;
 
    public void invokeBrowser(String browserName) {
 
        if (browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") + "\\src\\test\\java\\Driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
 
        else {
            System.setProperty("webdriver.edge.driver",
                    System.getProperty("user.dir") + "\\src\\test\\java\\Driver\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        if (prop == null) {
 
            prop = new Properties();
            try {
                FileInputStream file = new FileInputStream(
                        System.getProperty("user.dir") + "\\src\\main\\java\\Config\\Config.Properties");
                prop.load(file);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
 
        }
    }
 
    public void OpenURL(String websiteURL) {
        driver.get(prop.getProperty(websiteURL));
 
    }
 
    public void quitBrowser() {
        driver.quit();
    }
 
    
 
    
 
}
