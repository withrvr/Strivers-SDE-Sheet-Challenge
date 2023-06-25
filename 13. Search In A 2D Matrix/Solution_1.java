import java.util.ArrayList;

public class Solution_1 {
	static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
		int row = mat.size(), col = mat.get(0).size();
		int start = 0, end = row * col - 1;

		while (start <= end) {
			int mid = (start + end) >>> 1;
			int mid_value = mat.get(mid / col).get(mid % col);

			if (mid_value == target)
				return true;
			else if (mid_value < target)
				start = mid + 1;
			else
				end = mid - 1;
		}

		return false;
	}
}
