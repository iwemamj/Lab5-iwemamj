import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeGenerationTest {
	@Test
	public void testJUnit() {
		assertTrue("The compiler isn't feeling well today...", true);
	}
	
	@Test
	public void testOne(){
		assertEquals(new ArrayList<Integer>(),PrimeGeneration.findPrime(1));
	}

	@Test
	public void testThatFindPrimeFindsPrimesLessThanTwo(){
		assertEquals(new ArrayList<Integer>(),PrimeGeneration.findPrime(2));
	}
}
