// error: tracking from staring zero to end zero

class Solution {
	public int longestOnes(int[] arr, int k) {
		int count_zero = 0, res = 0;
		int l = 0, r = 0;

		for (; r < arr.length; ++r) {
			if (arr[r] == 0) {
				++count_zero;

				if (count_zero > k) {
					while (arr[++l] == 1) {
					}
					--count_zero;
				}

			}
			res = Math.max(res, r - l + 1);
		}

		return res;
	}
}
