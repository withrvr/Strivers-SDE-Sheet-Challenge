public class Solution {
	public static Node has_cycle(Node slow) {
		Node fast = slow;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast)
				return slow;
		}

		return null;
	}

	public static Node firstNode(Node head) {
		Node temp = has_cycle(head); // intersect point

		if (temp == null)
			return null;

		while (head != temp) {
			head = head.next;
			temp = temp.next;
		}

		return head;
	}
}
