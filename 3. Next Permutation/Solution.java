import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> nums) { // nums: permutation
		// System.out.println(Arrays.toString(nums));
		int len = nums.size();

		// where is the location
		int i;
		for (i = len - 2; i >= 0; --i)
			if (nums.get(i) < nums.get(i + 1))
				break;

		if (i != -1) { // no need of swap
			// System.out.println(i + " -- " + nums.get(i));

			// spawn with next big element to it
			// UPDATE: no need to check for index bound ... because it will be inside of
			// array only
			int j = len - 1;
			while (nums.get(j) <= nums.get(i))
				j--;

			// System.out.println(j + " -- " + nums.get(j));
			int temp = nums.get(j);
			nums.set(j, nums.get(i));
			nums.set(i, temp);
		}

		// reverse the rhs of location
		i++; // left
		len--; // right

		while (i < len) {
			int temp = nums.get(len);
			nums.set(len, nums.get(i));
			nums.set(i, temp);

			i++;
			len--;
		}

		// System.out.println(Arrays.toString(nums));
		return nums;
	}
}