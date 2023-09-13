public class TreeNode {
	int data;
	int val;

	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.data = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.data = val;
		this.left = left;
		this.right = right;
	}
}