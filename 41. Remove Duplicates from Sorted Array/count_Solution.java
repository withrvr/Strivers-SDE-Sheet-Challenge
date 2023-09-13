import java.util.ArrayList;

class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr, int n) {
		int l = 0, count = 1;

		for (int r = 1; r < n; ++r) {
			if (arr.get(l) != arr.get(r)) {
				l = r;
				++count;
			}
		}

		return count;
	}
}
