package stringutility;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.kata.stringutility.ReturnInputString;

public class TestReturnInputString {

	ReturnInputString myObj = new ReturnInputString(); 
	@Test
	public void testInputString() {
		assertEquals("Expected output is TEST", "TEST", myObj.returnInputStringBack("TEST"));
	}
}