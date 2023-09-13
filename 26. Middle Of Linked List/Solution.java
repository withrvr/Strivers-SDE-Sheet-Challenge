
public class Solution {
	public static Node findMiddle(Node head) {
		Node fast = head;

		while (fast != null && fast.next != null) {
			head = head.next;
			fast = fast.next.next;
		}

		return head;
	}
}
