package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestBase {

	public static AndroidDriver d;
	 public static Properties OR ;
	  public static Properties CONFIG ;
	 public static EventFiringWebDriver dr;

	public TestBase() throws IOException  {
		TestBase.SetPath();
				try {
				// initialize OR
				OR = new Properties();
				FileInputStream fs = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\main\\java\\Config\\OR.properties");
				OR.load(fs);

				// initialize CONFIG to corresponding env
				CONFIG = new Properties();
				fs = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\main\\java\\Config\\Config.properties");
				CONFIG.load(fs);

				// System.out.println(OR.getProperty("loginusername"));
				// System.out.println(CONFIG.getProperty("loginURL"));

			} catch (Exception e) {
				System.out.println("Error on intializing properties files");
			}
			
	
	}
	
	public static void SetPath() throws MalformedURLException {
		if (d == null) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("deviceName", "8917f630");
		capabilities.setCapability("platformVersion", "5.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		// capabilities.setCapability(MobileCapabilityType.TAKES_SCREENSHOT,
		// "true");
		capabilities.setCapability("newCommandTimeout",60000);
		capabilities.setCapability("autoWebviewTimeout",60000);
		d = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		}	
	}
	
	public void quit() {
		if (d != null) {
			d.quit();
			d = null;

		}
	}

	
	public static void takeScreenshot(String fileName) {
		File scrFile = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile,
					new File(System.getProperty("user.dir") + "\\screenshots\\" + fileName + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
