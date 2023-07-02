import java.util.*;

class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int target) {
		int n = arr.size();
		int count = 0;

		for (int i = 0; i < n; ++i) {
			int xor = 0;

			for (int j = i; j < n; ++j) {
				xor ^= arr.get(j);

				if (xor == target)
					++count;
			}
		}

		return count;
	}
}
