public class Solution {
	public static long maxSubarraySum(int[] arr, int n) {
		long max = Long.MIN_VALUE; // can use arr[0]
		long sum = 0; // sum = arr[0] .. don't work
		// int start = 0, end = 0, new_start = 0;

		for (int i = 0; i < n; i++) {
			sum += arr[i];

			if (sum > max) {
				max = sum;

				// start = new_start;
				// end = i;
			}

			if (sum < 0) {
				sum = 0;

				// new_start = i + 1;
			}
		}

		// if finally max is -ve
		// ie all element where -ve
		// if (max < 0) max = 0;
		return Math.max(max, 0);
	}
}
