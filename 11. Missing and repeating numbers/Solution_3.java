// tc: O(n)
// sc: O(1)

// https://youtu.be/2D0D8HE6uak?t=455

// nat_sum - ele_sum = miss - repeat

// take now square of individual we get
// sqr_nat_sum - sqr_ele_sum = (miss - repeat)(miss + repeat)

import java.util.ArrayList;

public class Solution_3 {
	public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
		// long nat_sum = n;
		long nat_sum = (n * (n + 1)) / 2;
		long ele_sum = 0;

		// individual square sum
		// long sqr_nat_sum = n * n;
		long sqr_nat_sum = (n * (n + 1) * (2 * n + 1)) / 6;
		long sqr_ele_sum = 0;

		for (int val : arr) {
			// for (int i = 0; i < n; i++) {
			// int val = arr.get(i);

			// nat_sum += i;
			ele_sum += val;

			// sqr_nat_sum += i * i;
			sqr_ele_sum += (long) (val * val);
		}

		long mis_sub_rep = nat_sum - ele_sum;
		long mis_plus_rep = (sqr_nat_sum - sqr_ele_sum) / mis_sub_rep;

		// long miss = (mis_sub_rep + mis_plus_rep) / 2;
		// long repeat = miss - mis_sub_rep;

		long miss = (mis_sub_rep + mis_plus_rep) / 2;
		long repeat = miss - mis_sub_rep;

		return new int[] { (int) miss, (int) repeat };
	}
}
