package fizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzHelperTest {
	private FizzBuzzHelper helper = new FizzBuzzHelper();
	
	@Test
	public void containsThreeTrue() {
		assertTrue(helper.containsThree(1325));
		assertTrue(helper.containsThree(13));
		assertTrue(helper.containsThree(3841));
		assertTrue(helper.containsThree(3123));
		assertTrue(helper.containsThree(3));
	}
	
	@Test
	public void containsThreeFalse() {
		assertFalse(helper.containsThree(5));
		assertFalse(helper.containsThree(58));
		assertFalse(helper.containsThree(124));
		assertFalse(helper.containsThree(77));
	}

}
