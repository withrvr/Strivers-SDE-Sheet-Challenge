import java.util.ArrayList;
import java.util.List;

public class Solution {
	static List<Integer> res;

	public static void helper(TreeNode root) {
		if (root == null)
			return;

		helper(root.left);
		res.add(root.data);
		helper(root.right);
	}

	public static List<Integer> getInOrderTraversal(TreeNode root) {
		res = new ArrayList<Integer>();
		helper(root);
		return res;
	}
}