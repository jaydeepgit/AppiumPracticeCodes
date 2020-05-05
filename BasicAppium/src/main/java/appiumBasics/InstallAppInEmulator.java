package appiumBasics;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class InstallAppInEmulator {
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Oneplus 6T");
		dc.setCapability("platformName", "Android");
		dc.setCapability("app", "D:\\Automation\\Appium\\Apk file\\leaforg.apk");
		
		AndroidDriver<WebElement> driver =  new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("App installed successfully");
		
	}

}