package org.example.Ios;

import io.appium.java_client.AppiumDriver;
import org.example.CreateDriverSessionOptions;

import java.util.concurrent.TimeUnit;

public class WebViewInspectUsingAI {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionOptions.initializeDriver("IOS");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
