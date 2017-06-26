package by.htp.googletest;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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

	/*
	 * @Test public void quizfulTest() throws InterruptedException {
	 * 
	 * driver.get("http://www.quizful.net"); Thread.sleep(5000); WebElement
	 * element =
	 * driver.findElement(By.xpath("//a[@href='/LoginAction.registration']"));
	 * // WebElement //
	 * element=driver.findElement(By.id("user-panel").tagName("li").tagName("a")
	 * ); Thread.sleep(5000); element.click(); Thread.sleep(5000); WebElement
	 * element1 = driver.findElement(By.id("login")); Thread.sleep(5000);
	 * element1.sendKeys("Monkey"); WebElement element2 =
	 * driver.findElement(By.xpath("//input[@name='registrationForm.password']")
	 * ); Thread.sleep(5000); element2.sendKeys("Donkey1234"); WebElement
	 * element3 = driver.findElement(By.xpath(
	 * "//input[@name='registrationForm.repassword']")); Thread.sleep(5000);
	 * element3.sendKeys("Donkey1234"); WebElement element4 =
	 * driver.findElement(By.xpath("//input[@name='registrationForm.email']"));
	 * Thread.sleep(5000); element4.sendKeys("bananafish@tut.by"); WebElement
	 * element5 = driver.findElement(By.id("corporate")); Thread.sleep(5000);
	 * element5.click(); WebElement element7 =
	 * driver.findElement(By.xpath("//input[@name='registrationForm.captcha']"))
	 * ; element7.click(); Thread.sleep(15000); WebElement element6 =
	 * driver.findElement(By.xpath("//input[@name='ok']")); Thread.sleep(5000);
	 * element6.click();
	 * 
	 * 
	 * }
	 */

	/*@Test
	public void itAcademynNewTest() throws InterruptedException {

		driver.get("http://www.it-academy.by");
		
		Actions builder1 = new Actions(driver);
		
		Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.xpath("//a[@href='/study']"));
		Thread.sleep(3000);
		 System.out.println(element1.getText());
		 Thread.sleep(3000);

		element1.click();
		Thread.sleep(5000);
		WebElement element2 = driver.findElement(By.xpath("//a[@href='/study/proforientaciya']"));
		Thread.sleep(5000);
		 System.out.println(element2.getText());
		 Thread.sleep(5000);
		WebElement element3 = driver.findElement(By.xpath("//a[@href='/study/career']"));
		Thread.sleep(5000);
		System.out.println(element3.getText());
		Thread.sleep(3000);
					
		WebElement element6 = driver.findElement(By.xpath("//a[@href='/study']"));
		Thread.sleep(3000);
		WebElement element4 = driver.findElement(By.xpath("//a[@href='/study/career/java-programmer']"));
		Thread.sleep(3000);
		builder1.moveToElement(element6).pause(3000).moveToElement(element3).pause(3000).moveToElement(element4).pause(3000).click(element4).pause(3000).build().perform();
		Thread.sleep(3000);
		driver.getCurrentUrl();
		Thread.sleep(5000);
		WebElement element8 = driver.findElement(By.id("page-title"));
		Thread.sleep(3000);
		System.out.println(element8.getText());
		Thread.sleep(5000);
						
		WebElement element9 = driver.findElement(By.xpath("//a[@href='/study']"));
		Thread.sleep(3000);
		WebElement element11 = driver.findElement(By.xpath("//a[@href='/study/career']"));
		Thread.sleep(3000);
		WebElement element16 = driver.findElement(By.xpath("//a[@href='/study/career/java-programmer']"));
		Thread.sleep(3000);
		WebElement element5 = driver.findElement(By.xpath("//a[@href='/study/career/bussines-analytic']"));
		Thread.sleep(5000);
		builder1.moveToElement(element9).pause(3000).moveToElement(element11).pause(3000).moveToElement(element16).moveToElement(element5).pause(3000).click(element5).build().perform();
		Thread.sleep(3000);
		driver.getCurrentUrl();
		Thread.sleep(5000);
		
		WebElement element10 = driver.findElement(By.id("page-title"));
		Thread.sleep(3000);
		System.out.println(element10.getText());
		Thread.sleep(3000);
		

		WebElement element12 = driver.findElement(By.xpath("//a[@href='/study']"));
		Thread.sleep(3000);
		WebElement element14 = driver.findElement(By.xpath("//a[@href='/study/career']"));
		Thread.sleep(3000);
		WebElement element17 = driver.findElement(By.xpath("//a[@href='/study/career/java-programmer']"));
		Thread.sleep(3000);
		WebElement element18 = driver.findElement(By.xpath("//a[@href='/study/career/bussines-analytic']"));
		Thread.sleep(5000);
		WebElement element15 = driver.findElement(By.xpath("//a[@href='/study/career/programmer']"));
		Thread.sleep(3000);
		builder1.moveToElement(element12).pause(1000).moveToElement(element14).pause(1000).moveToElement(element17).pause(1000).moveToElement(element18).pause(1000).moveToElement(element15).pause(1000).click(element15).build().perform();
		Thread.sleep(3000);
		driver.getCurrentUrl();
		Thread.sleep(5000);
		
		WebElement element19 = driver.findElement(By.id("page-title"));
		Thread.sleep(3000);
		System.out.println(element19.getText());
		

		
	}*/
	
	  @Test public void quizfulAllDataTest() throws InterruptedException {
	  
	  driver.get("http://www.quizful.net"); 
	  Thread.sleep(5000); 
	 // Actions builder = new Actions(driver);
	  Thread.sleep(5000); 
	  WebElement element =driver.findElement(By.xpath("//a[@href='/LoginAction.loginForm']"));
	  Thread.sleep(5000);
	  element.click(); 
	  Thread.sleep(5000);
	  WebElement element1 = driver.findElement(By.id("login")); 
	  Thread.sleep(5000);
	  element1.sendKeys("crazybatoner"); 
	  WebElement element2 = driver.findElement(By.xpath("//input[@name='loginForm.password']")); 
	  Thread.sleep(5000); 
	  element2.sendKeys("TeRRoR12345"); 
	  Thread.sleep(5000);
	   WebElement element6 =driver.findElement(By.xpath("//input[@name='ok']")); 
	   Thread.sleep(5000);
	  element6.click();
	  Thread.sleep(5000);
	  WebElement element8 = driver.findElement(By.xpath(".//*[@id='user-panel']/li[1]/b/a"));
	  Thread.sleep(5000);
	  element8.click();
	  Thread.sleep(5000);
	  //builder.moveToElement(element5).pause(3000).moveToElement(element4).pause(3000).click(element4).build().perform();
	 // element4.
	  WebElement element5 = driver.findElement(By.xpath(".//*[@id='middle']/div[2]/div[1]/div[2]/div/a"));
	  Thread.sleep(5000);
	  element5.click();
	  WebElement element19 = driver.findElement(By.xpath(".//*[@id='profile-notifications-form']/div[1]/b"));
	  Thread.sleep(5000);
	  element19.click();
	  Thread.sleep(5000);
	  WebElement element20 = driver.findElement(By.xpath(".//*[@id='profile-notifications-form']/div[2]/form/label[1]/input"));
	  Thread.sleep(5000);
	  element20.click();
	  Thread.sleep(5000);
	  WebElement element21 = driver.findElement(By.xpath(".//*[@id='profile-notifications-form']/div[2]/form/label[2]/input"));
	  Thread.sleep(5000);
	  element21.click();
	  Thread.sleep(5000);
	  WebElement element22 = driver.findElement(By.xpath(".//*[@id='profile-notifications-form']/div[2]/form/div/input"));
	  Thread.sleep(5000);
	  element22.click();
	  
	 /* WebElement element9 = driver.findElement(By.xpath(" .//*[@id='profile-personal-form']/div[2]/b"));
	  Thread.sleep(5000);
	  element9.click();
	  WebElement element11 = driver.findElement(By.xpath(" .//*[@id='profile-personal-form']/div[3]/form/table/tbody/tr[1]/td[2]/input"));
	  Thread.sleep(5000);
	  element11.sendKeys("Иван");
	  WebElement element12 = driver.findElement(By.xpath(" .//*[@id='profile-personal-form']/div[3]/form/table/tbody/tr[2]/td[2]/input"));
	  Thread.sleep(5000);
	  element12.sendKeys("Полубатонов");
	  WebElement element13 = driver.findElement(By.xpath(" .//*[@id='profile-personal-form']/div[3]/form/table/tbody/tr[3]/td[2]/input"));
	  Thread.sleep(5000);
	  element13.sendKeys("1986");
	  WebElement element14 = driver.findElement(By.xpath(" .//*[@id='profile-personal-form']/div[3]/form/table/tbody/tr[4]/td[2]/input"));
	  Thread.sleep(5000);
	  element14.sendKeys("bananafish@tut.by");
	  Thread.sleep(5000);
	  WebElement element15=driver.findElement(By.xpath(".//*[@id='profile-personal-form']/div[3]/form/table/tbody/tr[1]/td[4]/select"));
	  Thread.sleep(5000);
	  Select select = new Select(element15);
	  Thread.sleep(5000);
	  select.selectByVisibleText("Беларусь");
	  Thread.sleep(5000);
	  WebElement element16=driver.findElement(By.xpath(".//*[@id='profile-personal-form']/div[3]/form/table/tbody/tr[3]/td[4]/select"));
	  Thread.sleep(5000);
	  Select select1 = new Select(element16);
	  Thread.sleep(5000);
	  select1.selectByVisibleText("Белоруссия/Минск(GMT+3)"); 
	  Thread.sleep(5000);
	  WebElement element17 = driver.findElement(By.xpath(".//*[@id='profile-personal-form']/div[3]/form/table/tbody/tr[6]/td/textarea"));
	  Thread.sleep(5000);
	  element17.sendKeys("нормальный я нормальный");
	  Thread.sleep(5000);
	  WebElement element18 = driver.findElement(By.xpath(".//*[@id='profile-personal-form']/div[3]/form/div/input"));
	  Thread.sleep(5000);
	  element18.click();*/
	  
	  }
	@AfterClass
	public static void closeBrowser() { // driver.quit();
	}
}
