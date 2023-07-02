public class Solution {
	public static Node removeKthNode(Node head, int last) {
		Node slow = head, fast = head;

		// Move fast in front so that the gap between slow and fast becomes n
		// travel 1 step more so that next loop slow point to prev node
		// for (int i = 0; i <= last; ++i) // NOTE: is just use to move fast by last
		while (--last >= 0)
			fast = fast.next;

		if (fast == null) // if del ele is first ele only
			return head.next;

		// Move fast to the end, maintaining the gap
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}

		slow.next = slow.next.next; // logic
		return head;
	}
}
