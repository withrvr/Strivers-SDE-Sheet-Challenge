import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
		// if (nums == null || nums.length == 0)
		// return new ArrayList<Integer>();

		int num_1 = -1, num_2 = -1, cnt_1 = 0, cnt_2 = 0;
		for (int val : arr) {
			if (val == num_1)
				++cnt_1;
			else if (val == num_2)
				++cnt_2;
			else if (cnt_1 == 0) {
				num_1 = val;
				cnt_1 = 1;
			} else if (cnt_2 == 0) {
				num_2 = val;
				cnt_2 = 1;
			} else {
				--cnt_1;
				--cnt_2;
			}
		}

		// // cross checking
		// counting
		cnt_1 = 0;
		cnt_2 = 0;
		for (int val : arr) {
			if (val == num_1)
				++cnt_1;
			else if (val == num_2)
				++cnt_2;
		}

		// if count > check
		int check = arr.size() / 3;
		ArrayList<Integer> result = new ArrayList<Integer>();

		if (cnt_1 > check)
			result.add(num_1);
		if (cnt_2 > check)
			result.add(num_2);

		return result;
	}
}
