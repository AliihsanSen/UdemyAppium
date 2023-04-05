package org.example.Ios;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.example.CreateDriverSessionOptions;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class iOSInteractWithKeyboard {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionOptions.initializeDriver("IOS");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Dimension size = driver.manage().window().getSize();

        int startX = size.width / 2;
        int endX = startX;
        int startY = (int) (size.height*0.8);
        int endY = (int) (size.height*0.2);

        for( int i =0; i<1;i++){
            TouchAction touchAction = new TouchAction(driver);
            touchAction.press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                    .moveTo(PointOption.point(endX, endY))
                    .release()
                    .perform();
        }

        driver.findElement(MobileBy.AccessibilityId("Text Fields")).click();
        driver.findElement(MobileBy.xpath("//XCUIElementTypeCell [1]/XCUIElementTypeTextField")).click();
        Thread.sleep(3000);

        driver.findElement(MobileBy.AccessibilityId("q")).click();
        driver.findElement(MobileBy.AccessibilityId("w")).click();
        driver.findElement(MobileBy.AccessibilityId("e")).click();
        Thread.sleep(3000);
    }
}
