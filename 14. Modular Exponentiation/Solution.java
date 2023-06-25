// this coding ninja ... problem is diff
// and hard to understand
// but this is the solution

public class Solution {
	public static int modularExponentiation(long x, long n, long m) { // NOTE: parameter are changed to long
		long res = 1;

		while (n > 0) {
			if ((n & 1) == 1) { // n % 2 == 1
				res = (res * x) % m;
				// n--;
			}

			x = (x * x) % m;
			n >>= 1; // n /= 2;
		}

		return (int) res;
	}
}
