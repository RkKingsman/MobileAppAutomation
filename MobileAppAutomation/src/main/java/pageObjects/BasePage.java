package pageObjects;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BasePage {
	protected AndroidDriver driver;

	public void setUp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		caps.setCapability(MobileCapabilityType.APP,
				"C:\\Users\\rathnac\\Documents\\Mobile automation\\com.ulsumobile.calculator-1.1\\Calculator.apk");
		caps.setCapability(MobileCapabilityType.NO_RESET, "false");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	}
	
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
	

}
