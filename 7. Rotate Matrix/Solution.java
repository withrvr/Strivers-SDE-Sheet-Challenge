import java.util.ArrayList;

// matrix edge
// tl ... tr
// .. ... ..
// bl ... br

public class Solution {
	public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
		// n: rows, m: cols
		int l = 0, r = m - 1; // left right
		int t = 0, b = n - 1; // top bottom

		while (l < r && t < b) {
			int prev_val = mat.get(t + 1).get(l); // tl ... one down element
			int curr_val, i;

			// tl -> tr
			ArrayList<Integer> curr_row = mat.get(t); // up row
			for (i = l; i < r; ++i) {
				curr_val = curr_row.get(i);
				curr_row.set(i, prev_val);
				prev_val = curr_val;
			}

			// tr -> br
			for (i = t; i < b; ++i) {
				curr_row = mat.get(i);

				curr_val = curr_row.get(r);
				curr_row.set(r, prev_val);
				prev_val = curr_val;
			}

			// bl <- br
			curr_row = mat.get(b); // bottom row
			for (i = r; i > l; --i) {
				curr_val = curr_row.get(i);
				curr_row.set(i, prev_val);
				prev_val = curr_val;
			}

			// tl <- bl
			for (i = b; i > t; --i) {
				curr_row = mat.get(i);

				curr_val = curr_row.get(l);
				curr_row.set(l, prev_val);
				prev_val = curr_val;
			}

			++l;
			--r;
			++t;
			--b;
		}
	}
}
