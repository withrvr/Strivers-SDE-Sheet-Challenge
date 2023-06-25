public class Solution {
	public static int[] ninjaAndSortedArrays(int arr_1[], int arr_2[], int m, int n) {
		int i = arr_1.length;

		// x != 0 ..... x > 0
		while (n != 0)
			arr_1[--i] = m != 0 && arr_1[m - 1] > arr_2[n - 1]
					? arr_1[--m]
					: arr_2[--n];

		return arr_1;
	}
}
