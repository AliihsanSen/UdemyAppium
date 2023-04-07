package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class CreateBrowserSession {

    public static AppiumDriver initializeDriver(String platformName) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        URL url = new URL("http://0.0.0.0:4723/");

        switch (platformName) {
            case "Android":
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                //  caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
                caps.setCapability("avdLaunchTimeout", 180000);
                //  caps.setCapability("appPackage", "io.appium.android.apis");
                //  caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
                caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
                caps.setCapability(MobileCapabilityType.APP,
                        "/Users/tribe/Desktop/Projects/MyFirstAppiumProject/src/main/resources/ApiDemos-debug.apk");
                //  ==> Yüklenmemiş uygulamayı mobil cihaza yüklemek için kullanılır.

                return new AndroidDriver(url, caps);

            case "IOS":
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 14");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                caps.setCapability(MobileCapabilityType.UDID, "1F4002FB-EBF5-43CB-818F-6D23CFBA045E");
                //  caps.setCapability("simulatorStartupTimeout",180000);
                caps.setCapability(MobileCapabilityType.APP,
                        "/Users/tribe/Desktop/Projects/MyFirstAppiumProject/src/main/resources/UIKitCatalog-iphonesimulator.app");
                caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
                return new IOSDriver(url, caps);

            default:
                throw new Exception("Invalid Platform");

        }
    }
}
