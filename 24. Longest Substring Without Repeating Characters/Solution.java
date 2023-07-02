// 2 pointer / maps
// my logic

import java.util.*;

public class Solution {
	public static int uniqueSubstrings(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		int maxi = 0, n = str.length(), left = 0, right = 0;

		while (right < n) {
			Character val = str.charAt(right);

			if (map.containsKey(val)) {
				int temp = map.get(val) + 1;
				if (temp > left) {
					maxi = Math.max(maxi, right - left);
					left = temp; // NOTE: this is imp
				}
			}

			map.put(val, right);
			++right;
		}

		return Math.max(maxi, right - left);
	}
}
