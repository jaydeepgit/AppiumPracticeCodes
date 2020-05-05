package appiumBasics;
	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;

	import io.appium.java_client.android.AndroidDriver;

	public class SendMessageToAContact {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc  = new DesiredCapabilities();
		dc.setCapability("appPackage", "com.oneplus.mms");
		dc.setCapability("appActivity", "com.android.mms.ui.ConversationList");

		dc.setCapability("deviceName", "Oneplus 6T");
		dc.setCapability("platformName", "Android");
		dc.setCapability("noReset", true);
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	    
	    driver.findElementByAccessibilityId("Search messages").click();
	    Thread.sleep(5000);
	    
	    driver.findElementById("com.oneplus.mms:id/search_src_text").sendKeys("Sahil Jio");
	    Thread.sleep(5000);
	    driver.findElementById("com.oneplus.mms:id/title").click();
	    System.out.println("message box opened");
	    driver.findElementByXPath("//*[@class='android.widget.RelativeLayout']").click();
	    Thread.sleep(5000);
	    driver.findElementById("com.oneplus.mms:id/compose_message_text").sendKeys("Hi, ignore this message learning some technical activity");
	    
	    Thread.sleep(5000);
	    driver.findElementByAccessibilityId("Send Message").click();
	    System.out.println("message sent successfully");
	    

	}

	}

