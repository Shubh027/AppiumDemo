import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class AppTest {
    public static URL url;
    public static DesiredCapabilities capabilities;
    public static AndroidDriver<MobileElement> driver;
    //1
    @BeforeClass
    @Parameters({"deviceName_","port"})
    public void setupAppium(String deviceName_,String port) throws MalformedURLException {
        //2
        final String URL_STRING = "http://127.0.0.1:"+port+"/wd/hub";
        url = new URL(URL_STRING);
//3
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName_);
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/shubhamraj/Desktop/app-india-debug.apk");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //4
        driver = new AndroidDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.resetApp();
    }
    //5
    @AfterClass
    public void uninstallApp() throws InterruptedException {
        System.out.println("... Test Completed .. ");
    }




}