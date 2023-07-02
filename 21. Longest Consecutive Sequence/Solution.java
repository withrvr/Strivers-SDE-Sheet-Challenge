// sort logic

import java.util.Arrays;

public class Solution {
	public static int lengthOfLongestConsecutiveSequence(int[] nums, int n) {
		if (n == 0 || nums == null)
			return 0;

		Arrays.sort(nums);

		int longest = 1;
		int prev = nums[0];
		int cur_count = 1;

		for (int i = 1; i < n; i++) {
			if (nums[i] == prev + 1) {
				++cur_count;
			} else if (nums[i] != prev) {
				longest = Math.max(longest, cur_count);
				cur_count = 1;
			}

			prev = nums[i];
		}

		return Math.max(longest, cur_count);
	}
}
