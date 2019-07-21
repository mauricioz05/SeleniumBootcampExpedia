package Expedia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class browserfactory {
	static WebDriver driver;
    public  static WebDriver openbrowser(String browser, String url){

        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Mauricio\\Documents\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","C:\\Users\\Mauricio\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
       
    
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        driver.get(url);

        return driver;
    }}



