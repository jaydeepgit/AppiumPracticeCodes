import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LunchApp {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	DesiredCapabilities dc  = new DesiredCapabilities();
	dc.setCapability("appPackage", "com.oneplus.mms");
	dc.setCapability("appActivity", "com.android.mms.ui.ConversationList");
	
	dc.setCapability("deviceName", "Oneplus 6T");
	dc.setCapability("platformName", "Android");
	dc.setCapability("noReset", true);
	
	AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
    System.out.println("App lunched");

    

}

}
