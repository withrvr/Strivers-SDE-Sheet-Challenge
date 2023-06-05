// advance version of
// https://leetcode.com/problems/sort-colors/submissions/862796138/

// i is acting like n_2 only
// no need of n_2

public class Solution {
	public static void sort012(int[] arr) {
		int n_0 = -1, n_1 = -1;
		// , n_2 = -1;

		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] == 0) {
				arr[i] = 2; // arr[++n_2] = 2;
				arr[++n_1] = 1;
				arr[++n_0] = 0;
			} else if (arr[i] == 1) {
				arr[i] = 2; // arr[++n_2] = 2;
				arr[++n_1] = 1;
			}
			// else { // if (arr[i] == 2) {
			// n_2++; // arr[++n_2] = 2;
			// }
		}
	}
}