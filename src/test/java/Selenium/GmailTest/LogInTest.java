package Selenium.GmailTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LogInTest {
	WebDriver d=new FirefoxDriver();//Lunch Firefox Browser
	@Test
	public void checkLogInTest() throws InterruptedException {
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//Implicit wait
		d.get("https://www.gmail.com/");
		//WebElement signBtn=d.findElement(By.xpath("//a[text()='Sign In']"));
		//signBtn.click();
		d.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("khiti16@gmail.com");
		d.findElement(By.xpath("//span[text()='Next']")).click();

		d.findElement(By.xpath("//input[@name='password']")).sendKeys("Sama@1234");
		d.findElement(By.xpath("//span[text()='Next']")).click();
		d.findElement(By.xpath("//a[@href='https://mail.google.com/mail/u/0/#category/social']")).click();
		d.close();
	}

}
