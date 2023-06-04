public class Solution {
	public static void setZeros(int matrix[][]) {
		int row_len = matrix.length;
		int col_len = matrix[0].length;

		boolean flag_row[] = new boolean[row_len];
		boolean flag_col[] = new boolean[col_len];

		// if cell=0 ... make corresponding row and col as 0
		for (int i = 0; i < row_len; i++)
			for (int j = 0; j < col_len; j++)
				if (matrix[i][j] == 0) {
					flag_row[i] = true;
					flag_col[j] = true;
				}

		// row/col flag=0 ... then make it zero
		for (int i = 0; i < row_len; i++)
			for (int j = 0; j < col_len; j++)
				if (flag_row[i] || flag_col[j])
					matrix[i][j] = 0;
	}
}