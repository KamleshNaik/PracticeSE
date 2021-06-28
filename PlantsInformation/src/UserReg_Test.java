import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserReg_Test {

	/*to test if the user enters any field empty*/
	@Test
	public void test_empty_credentials() {
		PlantClass u1 = new PlantClass(1001, "kamleshnaik", "wolf123", 23);
		String actual_result = u1.Check_User_Registration(1001,"", "wolf123", 23);
		String expected_result = "user has not entered some fields please fill all credentials";
		assertEquals(expected_result,actual_result);
	}
	
	/*to test if the user enters all fields correctly*/
	@Test
	public void correct_credentials() {
		PlantClass u1 = new PlantClass(1001, "kamleshnaik", "wolf123", 23);
		String actual_result = u1.Check_User_Registration(1001,"kamleshnaik", "wolf123", 23);
		String expected_result = "succesfully registered";
		assertEquals(expected_result,actual_result);
	}
}
