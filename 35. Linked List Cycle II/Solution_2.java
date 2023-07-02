public class Solution_2 {
	public static Node firstNode(Node head) {
		Node slow = head, fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				while (head != fast) { // head: start_point, fast: intersection_point
					head = head.next;
					fast = fast.next;
				}

				return head;
			}
		}

		return null;
	}
}
