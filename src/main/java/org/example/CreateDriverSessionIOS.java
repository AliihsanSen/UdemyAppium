package org.example;

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
        caps.setCapability(MobileCapabilityType.UDID, "96D013BE-5B8C-4F7C-AAF6-AA5A4CDB0275");
        caps.setCapability(MobileCapabilityType.APP,
                "/Users/tribe/Desktop/Projects/FirstAppiumProject/src/main/resources/UIKitCatalog-iphonesimulator.app");

        URL url = new URL("http://0.0.0.0:4723/");

        AppiumDriver driver = new IOSDriver(url, caps);

    }
}
