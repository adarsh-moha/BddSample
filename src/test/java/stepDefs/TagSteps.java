package stepDefs;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;

public class TagSteps {
@Before(value="@tagdoor", order=1)
public void startdriver() {
	System.out.println("startdriverg");

}
@Before(value="@tagdoor", order=0
)
public void setupDriver() {
	System.out.println("setupDriver");

}

@BeforeStep("not @tagdoor")
public void doitfor() {
	System.out.println("Before Step");

}

@AfterStep
public void doitforall() {
	System.out.println("Before Step");

}
@Given("entered the room")
public void entered_the_room() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Given("room has a Door")
public void room_has_a_Door() {
    // Write code here that turns the phrase above into concrete actions
    
}
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    // Write code here that turns the phrase above into concrete actions
	   System.err.println("step 1");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	    // Write code here that turns the phrase above into concrete actions
		 System.err.println("step 2");
	}
	
	@Given("I want enter the door")
	public void i_want_enter_the_door() {
	    // Write code here that turns the phrase above into concrete actions
		 System.err.println("step enter the door");
	}

	@Given("drink some water")
	public void drink_some_water() {
	    // Write code here that turns the phrase above into concrete actions
		 System.err.println("step some water");
	}
}
