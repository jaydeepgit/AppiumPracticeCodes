import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SendMessageThroughWhatsApp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc  = new DesiredCapabilities();
		dc.setCapability("appPackage", "com.whatsapp");
		dc.setCapability("appActivity", "com.whatsapp.HomeActivity");

		dc.setCapability("deviceName", "Oneplus 6T");
		dc.setCapability("platformName", "Android");
		dc.setCapability("noReset", true);
		dc.setCapability("fullReset", false);
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	    System.out.println("Whatsapp homescreen lunched");
	    Thread.sleep(3000);
	    driver.findElementByAccessibilityId("Search").click();
	    Thread.sleep(3000);
	    driver.findElementById("com.whatsapp:id/search_src_text").sendKeys("APPIUM APRIL WD 2020");
	    Thread.sleep(3000);
	    driver.findElementByXPath("//android.widget.TextView[@text='APPIUM APRIL WD 2020']").click();
	    Thread.sleep(3000);
	    driver.findElementById("com.whatsapp:id/entry").sendKeys("This is a automated massage through Appium");
	    Thread.sleep(3000);
	    driver.findElementById("com.whatsapp:id/buttons").click();
	    System.out.println("Whatsapp message sent successfully");
    
	}

}
