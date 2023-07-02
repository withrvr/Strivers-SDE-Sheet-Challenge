import java.util.*;

public class Solution {
	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		int n = arr.size();
		int maxi = 0; // max length ... res
		int sum = 0; // prefix_sum / curr_sum / left_sum .... of arr till now
		HashMap<Integer, Integer> map = new HashMap<>(); // <val, idx>

		for (int i = 0; i < n; ++i) {
			sum += arr.get(i);

			if (sum == 0) {
				maxi = i + 1;
			} else if (map.containsKey(sum)) { // found
				maxi = Math.max(maxi, i - map.get(sum)); // curr_idx - found_val_idx
			} else {
				map.put(sum, i);
			}
		}

		return maxi;
	}
}
