class Solution {
	public int longestOnes(int[] arr, int k) {
		int count = 0, res = 0, l = 0, r = 0;

		for (; r < arr.length; ++r) {
			if (arr[r] == 0) {
				++count;

				if (count > k) {
					while (arr[++l] == 1)
						;
				}

				res = Math.max(res, r - l + 1);
			}
		}

		return Math.max(res, r - l);
	}
}
