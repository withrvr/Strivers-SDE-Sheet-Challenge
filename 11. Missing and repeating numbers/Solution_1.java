// sorting
// tc: O(nlogn + n)
// sc: O(1)

import java.util.Arrays;

public class Solution_1 {
	public int[] repeatedNumber(final int[] arr) {
		int miss = 0, repeat = 0;

		Arrays.sort(arr);

		for (int i = 1; i < arr.length; ++i) {
			int diff = arr[i] - arr[i - 1];

			if (diff == 2)
				miss = arr[i] - 1;
			else if (diff == 0)
				repeat = arr[i];

			// if both found
			// break;
			if (miss > 0 && repeat > 0)
				return new int[] { repeat, miss };
		}

		// miss = arr[0] == 1 ? arr.length : 1
		// adding here only ... since return in for loop
		return new int[] { repeat, arr[0] == 1 ? arr.length : 1 };

		// what is the logic ... explain here

		// NOTE: its sorted
		// base case if missing value is at start
		// ex. [2,2,3,4] out -> 2,1
		// ex. [1,1] out -> 1,2
		// ex. [1,1,2,4] out -> 1,3 ..... will get answer automatic
		// base case if missing value is at last
		// ex. [1,2,3,3,4] out -> 2,5
		// ex. [1,2,2,3,4] out -> 2,5
		// ex. [1,2,2,4,5] out -> 2,3 ..... will get automatically

		// if (miss == 0) {
		// miss = arr[0] == 1 ? arr.length : 1;
		// // .... same as this logic
		// // miss = arr[0] - 1; // .... ie: repeated is 2, miss is 1
		// // if (arr[0] == 1) {
		// // // miss = arr[arr.length - 1] + 1;
		// // miss = arr.length;
		// // }
		// }
	}
}