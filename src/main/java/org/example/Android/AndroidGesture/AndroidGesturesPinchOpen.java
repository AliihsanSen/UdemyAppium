package org.example.Android.AndroidGesture;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.example.CreateDriverSessionOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class AndroidGesturesPinchOpen {

    public static void main(String[] args) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //  caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        caps.setCapability("avdLaunchTimeout", 180000);
        caps.setCapability("appPackage", "com.google.android.apps.maps");
        caps.setCapability("appActivity", "com.google.android.maps.MapsActivity");

        URL url = new URL("http://0.0.0.0:4723/");

        AppiumDriver driver = new AppiumDriver(url, caps);
        System.out.println("Session Id : " + driver.getSessionId());
        pinchOpenGesture(driver);
    }

    public static void pinchOpenGesture(AppiumDriver driver) throws InterruptedException {

        Thread.sleep(500);
        driver.executeScript("mobile: pinchOpenGesture",
                ImmutableMap.of("left",200,
                        "top",4700,
                        "width",600,
                        "height",1070,
                        "percent",0.75));

    }
}
