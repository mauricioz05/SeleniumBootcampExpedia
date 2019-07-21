package ExpediaHW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Expedia.flightbooking;
import Expedia.browserfactory;

public class execute {
	   WebDriver driver;
	    
	    @Test
	    void create() {
	        driver = browserfactory.openbrowser("chrome", "http://www.expedia.com/");
	        flightbooking execute = PageFactory.initElements(driver, flightbooking.class);
	        execute.flight1(" dulles"," puerto");
	        execute.personalInfo("Mauricio","middle","last","3012343423","male",05,"28","1990");
	        execute.cardInfo("Mauricio middle last","2356456758976534",03,"2023","734");
	        execute.billingAddressInfo("addressone","optional add","Arlington","VA","22206","mauriciouemail@gmail.com","newpassID@1","newpassID@1");


	    }

	    @AfterSuite
	    void terminate(){
	        driver.quit();

	    }
}
