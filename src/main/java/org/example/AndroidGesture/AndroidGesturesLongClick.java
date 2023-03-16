package org.example.AndroidGesture;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.example.CreateDriverSessionOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class AndroidGesturesLongClick {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionOptions.initializeDriver("Android");
        longClickGesture(driver);

    }

    public static void longClickGesture(AppiumDriver driver){

        driver.findElement(MobileBy.AccessibilityId("Views")).click();
        driver.findElement(MobileBy.AccessibilityId("Drag and Drop")).click();
        WebElement element = driver.findElement(MobileBy.id("io.appium.android.apis:id/drag_dot_1"));
        driver.executeScript("mobile: longClickGesture",
                ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),
                        "duration",1000));

       /*
        driver.executeScript("mobile: longClickGesture",
                ImmutableMap.of("x",218, "y",580,"duration",1000));
                */

    }
}
