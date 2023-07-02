import java.util.*;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int target) {
		int count = 0;
		int xor = 0;

		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);

		for (int val : arr) {
			xor ^= val;

			// Required value of the prefix Xor to make the xor of the subarray ending at
			// the current index equal to X.

			// does anything happen before that can make complement ... if there is
			// this means there is another subset

			// int complement = xor ^ target;
			// if (map.containsKey(complement))
			// count += map.get(complement);

			count += map.getOrDefault(xor ^ target, 0);

			// +1 .... ++map[xor]
			map.put(xor, map.getOrDefault(xor, 0) + 1);
		}

		return count;
	}
}
