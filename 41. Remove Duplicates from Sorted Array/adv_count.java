import java.util.ArrayList;

class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr, int n) {
		int count = 0;

		for (int i = 1; i < n; ++i)
			if (arr.get(i) == arr.get(i - 1))
				++count;

		return n - count;
	}
}
