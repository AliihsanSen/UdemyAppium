package org.example;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSessionOptions {

    public static AppiumDriver initializeDriver(String platformName) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,platformName);
        caps.setCapability("newCommandTimeıut",300);

        URL url = new URL("http://0.0.0.0:4723/");

        switch (platformName) {
            case "Android":
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
                caps.setCapability("avdLaunchTimeout", 180000);
                caps.setCapability("appPackage", "io.appium.android.apis");
                caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

       /* caps.setCapability(MobileCapabilityType.APP,
              "/Users/tribe/Desktop/Projects/MyFirstAppiumProject/src/main/resources/ApiDemos-debug.apk");
              //  ==> Yüklenmemiş uygulamayı mobil cihaza yüklemek için kullanılır.
        */

                return new AndroidDriver(url,caps);

            case "IOS":

                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 14");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                caps.setCapability(MobileCapabilityType.UDID, "96D013BE-5B8C-4F7C-AAF6-AA5A4CDB0275");
                //caps.setCapability("simulatorStartupTimeout",180000);
                caps.setCapability(MobileCapabilityType.APP,
                        "/Users/tribe/Desktop/Projects/MyFirstAppiumProject/src/main/resources/UIKitCatalog-iphonesimulator.app");

                return new IOSDriver(url,caps);

            default:
                throw new Exception("Invalid Platform");

        }

    }
}
