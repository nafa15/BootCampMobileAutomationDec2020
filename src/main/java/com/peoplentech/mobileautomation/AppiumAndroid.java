package com.peoplentech.mobileautomation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumAndroid {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        cap.setCapability(MobileCapabilityType.UDID, "520099138df3b511");

        cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.tdbank");
        cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.td.dcts.android.us.app.SplashScreenActivity");
        //cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/src/main/resources/TD.apk");

        AppiumDriver appiumDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);

        appiumDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Thread.sleep(10000);

        //appiumDriver.findElement(By.xpath("//android.widget.TextView[@text='View Accounts']")).click();

        //appiumDriver.findElement(By.linkText("ACCOUNTS")).click();

        //appiumDriver.findElement(By.xpath("(//div[@class='_highlighter-box_619e8'])[18]")).click();

        appiumDriver.findElement(By.xpath("//android.widget.Button[@text='ACCOUNTS']")).click();


        Thread.sleep(10000);
        appiumDriver.quit();
    }
}
