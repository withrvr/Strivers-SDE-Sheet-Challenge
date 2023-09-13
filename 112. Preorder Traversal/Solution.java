import java.util.ArrayList;
import java.util.List;

public class Solution {
	static List<Integer> res;

	public static void helper(TreeNode root) {
		if (root == null)
			return;

		res.add(root.data);
		helper(root.left);
		helper(root.right);
	}

	public static List<Integer> getPreOrderTraversal(TreeNode root) {
		res = new ArrayList<Integer>();
		helper(root);
		return res;
	}
}