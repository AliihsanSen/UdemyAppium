package org.example.AndroidGesture;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.example.CreateDriverSessionOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class AndroidGesturesSwipe {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionOptions.initializeDriver("Android");
        swipeGesture(driver);
    }

    public static void swipeGesture(AppiumDriver driver){

        driver.findElement(MobileBy.AccessibilityId("Views")).click();


        WebElement element = driver.findElement(MobileBy.id("android:id/list"));

        driver.executeScript("mobile: swipeGesture",
                ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),
                        "direction","up","percent",0.75));

    }
}
