package raju.Testpackage;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import raju.poiDemo.sfdcLoginPage;

public class sfdcLoginTest {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://wise-wolf-inljhy-dev-ed.trailblaze.my.salesforce.com/");
	}
	@Test
	public void sfdcLoginTest() throws InterruptedException {
		sfdcLoginPage sfdclp=new sfdcLoginPage(driver);
		Thread.sleep(5);
		sfdclp.setUserName("informraju19@wise-wolf-inljhy.com");
		sfdclp.setPassword("Raju@12345");
		sfdclp.clickLoginButton();
		System.out.println("Please enter the varification code ");
		Scanner sc=new Scanner(System.in);
		
		Thread.sleep(5);
		String Verificationcode=sc.next();
		Thread.sleep(5);
		sfdclp.SetVerificationCode(Verificationcode);
		sfdclp.ClickOnVerifyButton();
		sfdclp.clickOnLoginIcon();
		Thread.sleep(5);
		Assert.assertEquals(sfdclp.LogedUserName(), "Raju Kumar");
	}
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
}
