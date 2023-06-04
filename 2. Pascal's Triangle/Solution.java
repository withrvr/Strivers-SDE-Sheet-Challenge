import java.util.ArrayList;
// import java.util.Arrays;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int numRows) {
		ArrayList<ArrayList<Long>> result = new ArrayList<>();
		ArrayList<Long> row = new ArrayList<>(), prev = null;

		row.add(1l);
		result.add(row);
		if (numRows == 1)
			return result;

		for (int i = 1; i < numRows; ++i) {
			row = new ArrayList<>();

			row.add(1l);
			for (int j = 1; j < i; j++)
				row.add(prev.get(j - 1) + prev.get(j));
			row.add(1l);

			result.add(row);
			prev = row;
		}

		return result;
	}
}
