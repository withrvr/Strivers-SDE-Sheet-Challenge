public class Solution {
	public static boolean detectCycle(Node slow) {
		Node fast = slow;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast)
				return true;
		}

		return false;
	}
}
