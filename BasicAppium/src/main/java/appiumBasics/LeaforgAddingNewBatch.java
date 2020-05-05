package appiumBasics;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LeaforgAddingNewBatch {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("appPackage", "com.testleaf.leaforg");
		dc.setCapability("appActivity", "com.testleaf.leaforg.MainActivity");
		dc.setCapability("deviceName", "OnePlus 6T");
		dc.setCapability("platformName", "Android");
		dc.setCapability("noReset", true);

		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Set<String> allCon = driver.getContextHandles();
		System.out.println(allCon.size());
		for (String eachCon : allCon) {
		System.out.println(eachCon);
		driver.context(eachCon);
	}
		Thread.sleep(20000);
	driver.findElementByXPath("//input[@placeholder='Email']").sendKeys("rajkumar@testleaf.com");
	driver.findElementByXPath("//input[@placeholder='Password']").sendKeys("Leaf@123");
	driver.findElementByXPath("//span[contains(text(), 'Login')]").click();
	Thread.sleep(20000);
	System.out.println("clicking settings");
	driver.findElementByXPath("//ion-icon[@aria-label='settings']").click();

}}