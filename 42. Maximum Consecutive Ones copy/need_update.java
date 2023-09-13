import java.util.ArrayList;

class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr, int n, int k) {
		int count = 0, res = 0, extra = 0;

		for (int val : arr) {
			if (val == 1) {
				++count;
			} else if (extra < k) {
				++extra;
				++count;
			} else {
				res = Math.max(res, count);
				count = 0;
				extra = 0;
			}
		}

		return Math.max(res, count);
	}
}
