package Infinity.YourTest;

import java.io.File;
import java.net.URI;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import Interface_layer.Landing_page_int;

public class Helper_class extends drivers implements Landing_page_int{
	
	public void get_url(String url){
	    

		driver.get(url);
	}
	public void element_enabled(String text){
		driver.findElement(By.id(text)).isEnabled();
	}
	public void element_is_displayed(String text){
		driver.findElement(By.id(text)).isDisplayed();
	}
	public void do_click_link_text(String click) throws Exception{
		driver.findElement(By.linkText(click)).click();
		}
	public void do_click(String click) throws Exception{
		driver.findElement(By.id(click)).click();
		}
	
	public void send_text(String sendtext_locator, String sendtext) throws Exception{
		driver.findElement(By.id(sendtext_locator)).sendKeys(sendtext);
	}
	public void set_browser(){
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	public void assert_text(String text){
	 String Actual_Title = driver.getTitle();
     String Expected_Title = text;
     Assert.assertEquals(Actual_Title, Expected_Title);
	}
	public void assert_text(String text, String text1){
		 String Actual_Title = driver.findElement(By.cssSelector(text)).getText();
	     String Expected_Title = text1;
	     Assert.assertEquals(Actual_Title, Expected_Title);
		}
	public void assert_text(String text, String text1, String text2){
		 String Actual_Title = driver.findElement(By.id(text)).getAttribute(text1);
	     String Expected_Title = text2;
	     Assert.assertEquals(Actual_Title, Expected_Title);
		}
}
