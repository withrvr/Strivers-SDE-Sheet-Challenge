import java.util.ArrayList;

class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr, int n) {
		for (int i = 1; i < arr.size();) {
			if (arr.get(i - 1) == arr.get(i))
				arr.remove(i);
			else
				++i;
		}

		return arr.size();
	}
}
