public class Solution {
	public static int findMajority(int[] arr, int n) {
		int count = 0, majority = -1;

		for (int val : arr) {
			if (count == 0) {
				count = 1;
				majority = val;
			} else if (majority == val)
				++count;
			else
				--count;
		}

		// NOTE: since in this problem is not sure
		// majority will be > (n/2)

		// thats y extra code for checking
		// because there may be testcase

		// but for other list
		// checking if majority ele is actually majority ele
		int count_2 = 0;
		for (int val : arr)
			if (val == majority)
				++count_2;

		if ((n / 2) > count_2)
			return -1;

		return majority;
	}
}
