package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityBaseClass {
	public static WebDriver driver;

	public static WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		return driver;
	}

	public static void closeBrowser() {
		driver.quit();

	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void browserMaximize() {
		driver.manage().window().maximize();

	}

	public static void fill(WebElement element, String txt) {
		element.sendKeys(txt);

	}

	public static void BtnClick(WebElement element) {
		element.click();

	}
	
	public static void impWait() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	public static void copyTxt() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void pasteTxt() throws AWTException {
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);

		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);

	}

	public static void keyTab() throws AWTException {
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_TAB);
		r2.keyRelease(KeyEvent.VK_TAB);

	}
	
	public static String retriveText(WebElement ele) {
		String text =ele.getText();
		return text;
	}

	public void dDnSelectByValue(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}
	
	
}
