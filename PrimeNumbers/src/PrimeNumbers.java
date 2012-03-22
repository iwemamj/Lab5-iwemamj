import java.util.ArrayList;

public class PrimeNumbers {
	public static ArrayList<Integer> generatePrimes(int n) {
		ArrayList<Integer> ret = new ArrayList<Integer>();

		for (int canidate = 2; n > 1; canidate++) {
			for (; n % canidate == 0; n /= canidate) {
				ret.add(canidate);
			}
		}

		return ret;
	}
}
