import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class Solution {
	public static ArrayList<int[]> pairSum(int arr[], int target) {
		ArrayList<int[]> res = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int val : arr) {
			int complement = target - val;
			int count = map.getOrDefault(complement, 0);
			// using count since duplicate may be there ... ex. 4,2,2,4,2,4,2

			while (--count >= 0) {
				// add both in sorted order
				// res.add(new int[] { Math.min(complement, val), Math.max(complement, val) });
				res.add(complement < val ? new int[] { complement, val } : new int[] { val, complement });
			}

			map.put(val, map.getOrDefault(val, 0) + 1);
		}

		// and our logic will not do it
		// since output needed in sorted order
		Collections.sort(res, (a, b) -> {
			return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]; // if equal check for 2nd position ... else first
		});

		return res;
	}
}
