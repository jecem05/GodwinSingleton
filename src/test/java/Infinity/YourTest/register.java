package Infinity.YourTest;

import org.openqa.selenium.WebDriver;

import Interface_layer.Landing_page_int;
import abstraction.Click;
import cucumber.api.java.en.Given;

public class register implements Landing_page_int {
	WebDriver driver;
	
	Helper_class register_page = new Helper_class();
   // Click register_click = new Click("");	
	
	public register(){
		this.driver = landing_main.driver;
	}

@Given("^I click \"([^\"]*)\" button$")
public void i_click_button(String reg_click) throws Throwable {
    switch(reg_click){
    case"register":
    	register_page.element_enabled(Register_Button);
    	register_page.do_click(Register_Button);
    	break;
    case"register_on_form":
    	register_page.do_click(Register_Button_form);
    	break;
    case"Login":
    	register_page.do_click("LoginBtn");
    	break;
    	default:
   }
}


//boolean: means true or false 
@Given("^I enter \"([^\"]*)\"$")
public void i_enter(String reg_ent) throws Throwable {
	switch(reg_ent){
	case"Email address":
		register_page.element_is_displayed(Email_Text_Field);
		register_page.send_text(Email_Text_Field, Email_Text);
		break;
	case"Preffered_username":
		register_page.send_text(preffered_Name_Textfield, WEG_001);
		break;
	case"Password":
		register_page.send_text(Password_textfield, Password);
		break;
	case"confirm_password":
		register_page.send_text(Confirm_password_textfield, Confirm_password);
		break;
    
}



// Assignment
// Check out the meaning of keyword this in Java
// Write 20 java keywords you know
// When to use if statement and when to use case switch statement

}
}