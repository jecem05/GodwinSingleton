package Infinity.YourTest;

import org.openqa.selenium.WebDriver;

import Interface_layer.Landing_page_int;
import Interface_layer.Reg_Page_int;
import cucumber.api.java.en.Then;

public class place_holder_reg implements Reg_Page_int, Landing_page_int  {
	WebDriver driver;
	Helper_class reg_page = new Helper_class();
	
	@Then("^I confirm \"([^\"]*)\" text_field has a place holder of \"([^\"]*)\"$")
	public void i_confirm_text_field_has_a_place_holder_of(String element_locator, String value) throws Throwable {
	    switch(element_locator){
	    case"Email_Address":
	    	reg_page.assert_text(Email_Text_Field, EMAIL_AD_LOCATOR, value);
	    	break;
	    case"username":
	    	reg_page.assert_text(USERNAME_TEXT_FIELD_LOCATOR, EMAIL_AD_LOCATOR, value);
	    	break;
	    	default:
	    		
	    	
	    }
	}
}
