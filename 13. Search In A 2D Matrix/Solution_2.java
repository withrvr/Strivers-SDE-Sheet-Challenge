import java.util.ArrayList;

public class Solution_2 {
	// search in row
	// which col ?
	static boolean helper(ArrayList<Integer> col_arr, int target) {
		int left = 0, right = col_arr.size() - 1;

		while (left <= right) {
			int mid = (left + right) >>> 1;
			int val = col_arr.get(mid);

			if (target == val)
				return true;
			else if (target < val)
				right = mid - 1;
			else
				left = mid + 1;
		}

		return false;
	}

	static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
		int row = mat.size();
		int col = mat.get(0).size();

		// if value overflow ... than smallest n biggest
		if (target < mat.get(0).get(0) || target > mat.get(row - 1).get(col - 1))
			return false;

		// which row ? ... by checking two rows ... first values
		int up = 0, down = row - 2, mid = 0;
		while (up <= down) {
			mid = (up + down) >>> 1;

			ArrayList<Integer> curr_row = mat.get(mid);

			if (curr_row.get(0) == target)
				return true;
			else if (curr_row.get(0) < target && target < mat.get(mid + 1).get(0))
				return helper(curr_row, target);
			else if (target < curr_row.get(0))
				down = mid - 1;
			else
				up = mid + 1;
		}

		// in case no of row == 0
		// or
		// target row ... not found ... then target row ... is last row
		return helper(mat.get(row - 1), target);
	}
}
