import java.util.ArrayList;

public class PrimeGeneration {

	public static ArrayList<Integer> findPrime(int limit) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		boolean flag;
		
		for (int i = 2; i < limit; i++) {
			flag = false;
			for (int k = 2; k < i; k++) {
				if (i % k == 0) flag = true;
			}
			
			if (!flag)	primes.add(i);
		}
		
		return primes;
	}
}
