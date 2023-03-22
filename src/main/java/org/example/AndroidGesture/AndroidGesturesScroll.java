package org.example.AndroidGesture;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.example.CreateDriverSessionOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class AndroidGesturesScroll {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionOptions.initializeDriver("Android");
        scrollGesture(driver);

    }
    public static void scrollGesture(AppiumDriver driver){
        driver.findElement(MobileBy.AccessibilityId("Views")).click();
        //WebElement element = driver.findElement(MobileBy.id("android:id/list"));
        WebElement element = driver.findElement(MobileBy.AccessibilityId("Animation"));

        boolean canScrollMore = true;
        while(canScrollMore){
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    //  "left", 100, "top", 100, "width", 600, "height", 600,
                    "elementId", ((RemoteWebElement) element).getId(),
                    "direction", "down",
                    "percent", 1.0
            ));
            System.out.println(canScrollMore);
        }
    }
}
