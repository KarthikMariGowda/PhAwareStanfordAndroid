import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TestClass
{
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args)
	{
		
		
try {
	openApp();
} catch (Exception e) {
	e.getMessage();
	e.printStackTrace();
	
	
}
	}
	
	
 public static void openApp() throws MalformedURLException
{
	DesiredCapabilities cap = new DesiredCapabilities();
	//we are letting the appium server to know about the device
	cap.setCapability("deviceName","Moto X(2nd Generation)");
	cap.setCapability("udid","TA99300GPS");
	cap.setCapability("platformName","Android");
	cap.setCapability("platformVersion","6.0");

	//we are letting the appium server to know about the application
	//com.emotransglobal.emotrans/com.emotransglobal.emotrans.activities.HomeActivity}
	cap.setCapability("appPackage", "com.phaware.DynAMITEWTT");//com.dreamorbit.walktalktrack//com.emotransglobal.emotrans
	cap.setCapability("appActivity", "com.dreamorbit.walktalktrack.screens.splash.SplashActivity t2381");//com.emotransglobal.emotrans.activities.HomeActivity
	// which automaion engine to be used 
	
	cap.setCapability("automationName","Espresso");
	
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	driver= new AppiumDriver<MobileElement>(url,cap);
	System.out.println("started");
}

	

}
