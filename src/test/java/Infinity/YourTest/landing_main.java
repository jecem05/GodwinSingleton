package Infinity.YourTest;

import Interface_layer.Landing_page_int;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class landing_main extends drivers implements Landing_page_int{
	
	Helper_class Landing_page = new Helper_class();
	
	@Before
	public void set_test(){
		Landing_page.set_browser();
	}
	
	@Given("^I launch the \"([^\"]*)\"$")
	public void i_launch_the(String url) throws Throwable {
        Landing_page.get_url(Test_url);
	}

	@Then("^I see the \"([^\"]*)\" page displayed$")
	public void i_see_the_page_displayed(String text) throws Throwable {
		switch(text){
			case"Login":
				 Landing_page.assert_text("Login");
				break;
			case"Home":
				 Landing_page.assert_text("Home");
				break;
			case"Registration successfull":
				Landing_page.assert_text(Registration_successful_locator, Registration_successful_message);
				break;
			case"Registration":
				 Landing_page.assert_text("Registration");
				break;
				default:
				}
     }
	
	@After
	public void close_browser(){
		//driver.close();
	}
}
