import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class PrimeFactorsTest {
	@Test
	public void testJUnit(){
		assertTrue("The compiler isn't feeling well today...",true);
	}
	
	@Test
	public void testOne(){
		assertEquals(list(), PrimeNumbers.generatePrimes(1));
	}
	
	@Test
	public void testTwo(){
		assertEquals(list(2),PrimeNumbers.generatePrimes(2));
	}
	
	@Test
	public void testThree(){
		assertEquals(list(3),PrimeNumbers.generatePrimes(3));
	}
	
	@Test
	public void testFour(){
		assertEquals(list(2,2),PrimeNumbers.generatePrimes(4));
	}
	
	private ArrayList<Integer> list(int...ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i : ints){
			ret.add(i);
		}
		return ret;
	}


}
