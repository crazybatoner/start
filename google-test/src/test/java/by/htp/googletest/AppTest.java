package by.htp.googletest;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest {
	private static WebDriver driver;

	@BeforeClass
	public static void initBrowser() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "d://driver//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	/*
	 * @Test public void googleSearchTest() {
	 * driver.get("http://www.google.com"); WebElement element =
	 * driver.findElement(By.id("lst-ib")); element.sendKeys("Java");
	 * driver.getTitle().contains("Java"); }
	 */

	/*
	 * @Test public void tutbyMainNewTest() throws InterruptedException {
	 * 
	 * driver.get("http://www.tut.by");
	 * 
	 * driver.findElement(By.className("entry-head")).click();
	 * 
	 * Thread.sleep(5000);
	 * 
	 * System.out.println(driver.getCurrentUrl());
	 * 
	 * Thread.sleep(10000);
	 * 
	 * int p=driver.findElements(By.tagName("p")).size(); System.out.println(p);
	 * 
	 * }
	 */

	/*@Test
	public void quizfulTest() throws InterruptedException {

		driver.get("http://www.quizful.net");
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//a[@href='/LoginAction.registration']"));
		// WebElement
		// element=driver.findElement(By.id("user-panel").tagName("li").tagName("a"));
		Thread.sleep(5000);
		element.click();
		Thread.sleep(5000);
		WebElement element1 = driver.findElement(By.id("login"));
		Thread.sleep(5000);
		element1.sendKeys("Monkey");
		WebElement element2 = driver.findElement(By.xpath("//input[@name='registrationForm.password']"));
		Thread.sleep(5000);
		element2.sendKeys("Donkey1234");
		WebElement element3 = driver.findElement(By.xpath("//input[@name='registrationForm.repassword']"));
		Thread.sleep(5000);
		element3.sendKeys("Donkey1234");
		WebElement element4 = driver.findElement(By.xpath("//input[@name='registrationForm.email']"));
		Thread.sleep(5000);
		element4.sendKeys("bananafish@tut.by");
		WebElement element5 = driver.findElement(By.id("corporate"));
		Thread.sleep(5000);
		element5.click();
		WebElement element7 = driver.findElement(By.xpath("//input[@name='registrationForm.captcha']"));
		element7.click();
		Thread.sleep(15000);
		WebElement element6 = driver.findElement(By.xpath("//input[@name='ok']"));
		Thread.sleep(5000);
		element6.click();
		

	}*/
	
	  @Test public void itAcademynNewTest() throws InterruptedException {
	  
	  driver.get("http://www.it-academy.by");
	  
	  Thread.sleep(5000);
	  WebElement element1=driver.findElement(By.xpath("//a[@href='/study']"));
	  Thread.sleep(5000);
	  System.out.println(element1.getText());
	  Thread.sleep(5000);
	 WebElement element3= driver.findElement(By.xpath(".//*[@id='main-menu']/div[1]/ul/li[2]/ul/li[1]/a"));
	  Thread.sleep(5000);
	 // WebElement element3 = driver.findElement(By.xpath("//*[@title='']"));
	// Thread.sleep(5000);
	// System.out.println("aa");
	  System.out.println(element3.getAttribute("title"));
	  Thread.sleep(5000);
	  System.out.println(element3.getText());
	 
	  }
	 
	@AfterClass
	public static void closeBrowser() { // driver.quit();
	}
}
