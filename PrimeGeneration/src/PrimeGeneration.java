import java.util.ArrayList;


public class PrimeGeneration {
	
	public static ArrayList<Integer> findPrime(int limit){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		for (int i = 2; i < limit; i++){
			primes.add(i);
		}
		return primes;  
	}
}
