package Infinity.YourTest;

import org.openqa.selenium.WebDriver;

import Interface_layer.Landing_page_int;
import cucumber.api.java.en.Given;

public class efficient_registration implements Landing_page_int{
	
	WebDriver driver;
	Helper_class Efficient_R_Page = new Helper_class();
	
	
	
	@Given("^I enter \"([^\"]*)\" as \"([^\"]*)\" in the text field$")
	public void i_enter_as_in_the_text_field(String element_locator, String value) throws Throwable {
		switch(element_locator){
		case "Email address":
			Efficient_R_Page.send_text(Email_Text_Field, value);
			break;
		case "Preffered_username":
			Efficient_R_Page.send_text(preffered_Name_Textfield, value);
			break;
		case "Password":
			Efficient_R_Page.send_text(Password_textfield, value);
			break;
		case "confirm_password":
			Efficient_R_Page.send_text(Confirm_password_textfield, value);
			break;
		default:
		}
	}
}
