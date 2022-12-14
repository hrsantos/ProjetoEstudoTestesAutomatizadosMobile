package utils;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Utils {
	
	public static AppiumDriver<WebElement> driver;
	
	public static void acessarKeep() throws MalformedURLException {
		//codigo extraido via Appium Parametros de inicialização do app no Android
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "com.google.android.keep");
		desiredCapabilities.setCapability("appActivity", "com.google.android.apps.keep.ui.activities.BrowseActivity");

		//URL remoteUrl = new URL("http://localhost:4723/wd/hub");

		driver = new AppiumDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
	}
}
