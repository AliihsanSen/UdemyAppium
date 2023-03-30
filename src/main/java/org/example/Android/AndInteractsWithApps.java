package org.example.Android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import okio.Timeout;
import org.example.CreateDriverSessionOptions;
import org.openqa.selenium.By;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AndInteractsWithApps {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionOptions.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By views = MobileBy.AccessibilityId("Views");
        driver.findElement(views).click();
        Thread.sleep(3000);

        driver.terminateApp("io.appium.android.apis");
        System.out.println(driver.queryAppState("io.appium.android.apis"));
        Thread.sleep(5000);

        driver.terminateApp("io.appium.android.apis");
        Thread.sleep(5000);

        System.out.println(driver.queryAppState("io.appium.android.apis"));
        // driver.runAppInBackground(Duration.ofMillis(5000));
        driver.terminateApp("io.appium.android.apis");
        Thread.sleep(5000);

        driver.activateApp("com.android.settings");
        Thread.sleep(5000);

        driver.activateApp("io.appium.android.apis");
        // System.out.println(driver.isAppInstalled("io.appium.android.apis"));
        // driver.terminateApp("io.appium.android.apis");
        // driver.installApp(andAppUrl, new AndroidInstallApplicationOptions().withReplaceEnabled());
    }
}
