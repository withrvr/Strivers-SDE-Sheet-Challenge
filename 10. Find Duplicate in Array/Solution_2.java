// f.java

import java.util.ArrayList;

public class Solution_2 {
	public static int findDuplicate(ArrayList<Integer> arr, int n) {
		boolean visited[] = new boolean[n];

		for (int val : arr) {
			if (visited[val] == true)
				return val;
			else
				visited[val] = true;
		}

		return -1;
	}
}
