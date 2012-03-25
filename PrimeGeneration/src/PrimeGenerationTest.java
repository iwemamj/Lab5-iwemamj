import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeGenerationTest {
	@Test
	public void testJUnit() {
		assertTrue("The compiler isn't feeling well today...", true);
	}
	
	@Test
	public void testOne(){
		assertEquals(new ArrayList<Integer>(),PrimeGeneration.FindPrime(1));
	}

}
