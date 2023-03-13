package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSessionAndroid {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
      //  caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        caps.setCapability("avdLaunchTimeout", 180000);
        caps.setCapability("appPackage", "io.appium.android.apis");
        caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

       /* caps.setCapability(MobileCapabilityType.APP,
              "/Users/tribe/Desktop/Projects/MyFirstAppiumProject/src/main/resources/ApiDemos-debug.apk");
              //  ==> Yüklenmemiş uygulamayı mobil cihaza yüklemek için kullanılır.
        */

        URL url = new URL("http://0.0.0.0:4723/");

        AppiumDriver driver = new AndroidDriver(url, caps);
        System.out.println("Session Id : " + driver.getSessionId());

    }
}
