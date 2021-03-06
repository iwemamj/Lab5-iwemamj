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
	
	@Test
	public void testThatFindPrimeFindsPrimesLessThanThree(){
		assertEquals(list(2),PrimeGeneration.findPrime(3));
	}
	
	@Test
	public void testThatFindPrimeFindsPrimesLessThanFour(){
		assertEquals(list(2, 3),PrimeGeneration.findPrime(4));
	}
	
	@Test
	public void testThatFindPrimeFindsPrimesLessThanFive(){
		assertEquals(list(2,3),PrimeGeneration.findPrime(5));
	}
	
	@Test
	public void testThatFindPrimeFindsPrimesLessThanSix(){
		assertEquals(list(2,3,5),PrimeGeneration.findPrime(6));
	}
	
	@Test
	public void testThatFindPrimeFindsPrimesLessThanEight(){
		assertEquals(list(2,3,5,7),PrimeGeneration.findPrime(8));
	}
	
	@Test
	public void testThatFindPrimeFindsPrimesLessThanOneHundred(){
		assertEquals(list(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97),PrimeGeneration.findPrime(100));
	}
		
	
	private ArrayList<Integer> list(int... ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i : ints) {
			ret.add(i);
		}
		return ret;
	}
}
