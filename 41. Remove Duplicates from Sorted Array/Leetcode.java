class Solution {
	public int removeDuplicates(int[] arr) {
		int count = 0;

		for (int val : arr)
			if (arr[count] != val)
				arr[++count] = val;

		return count + 1;
	}

	// public int index_logic_removeDuplicates(int[] arr) {
	// int count = 0;

	// for (int i = 1; i < arr.length; ++i)
	// if (arr[count] != arr[i])
	// arr[++count] = arr[i];

	// return count + 1;
	// }
}
