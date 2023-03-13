package org.example;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSessionOptions {

    public static void main(String[] args) {

    }

    public static AppiumDriver initializeDriver(String platformName) throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,platformName);
        caps.setCapability("newCommandTimeıut",300);

        URL url = new URL("http://0.0.0.0:4723/");



    }
}
