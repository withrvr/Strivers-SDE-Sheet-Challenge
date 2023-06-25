// g.java ... small/fast version

import java.util.ArrayList;

public class Solution {
	public static int findDuplicate(ArrayList<Integer> arr, int n) {
		int slow = 0, fast = 0;

		do {
			slow = arr.get(slow);
			fast = arr.get(arr.get(fast));
		} while (slow != fast);

		slow = 0;
		while (fast != slow) {
			slow = arr.get(slow);
			fast = arr.get(fast);
		}

		return fast;
	}
}
