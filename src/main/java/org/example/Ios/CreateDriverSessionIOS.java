package org.example.Ios;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSessionIOS {
    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 14");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        caps.setCapability(MobileCapabilityType.UDID, "1F4002FB-EBF5-43CB-818F-6D23CFBA045E");
        //caps.setCapability("simulatorStartupTimeout",180000);
        caps.setCapability(MobileCapabilityType.APP,
                "/Users/tribe/Desktop/Projects/MyFirstAppiumProject/src/main/resources/UIKitCatalog-iphonesimulator.app");

        URL url = new URL("http://0.0.0.0:4723/");

        AppiumDriver driver = new IOSDriver(url, caps);

    }
}
