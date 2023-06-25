// memorization / hashmap

// tc: O(n + n)
// sc: O(n)

import java.util.ArrayList;

public class Solution_2 {

	public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
		int miss = 0, repeat = 0;
		short[] h_map = new short[n + 1];

		// count no of time came
		for (int val : arr)
			h_map[val]++;

		// if count -> 2/0
		for (int i = 1; i <= n; ++i) {
			if (h_map[i] == 2)
				repeat = i;
			else if (h_map[i] == 0)
				miss = i;

			// if both found
			if (miss > 0 && repeat > 0)
				break;
		}

		return new int[] { miss, repeat };
	}
}
