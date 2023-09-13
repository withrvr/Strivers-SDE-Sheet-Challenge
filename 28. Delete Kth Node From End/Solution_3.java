// my logic
// move to mid
// find len
// then move front remaining part

public class Solution_3 {
	public static Node removeKthNode(Node head, int last) {
		if (head == null || last == 0)
			return head;

		if (head.next == null) // IMP: base condition
			return null;

		// move to mid
		Node slow = head, fast = head;
		int mid = 0;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			++mid;
		}

		// fast == null // even
		// fast.next == null // odd
		int len = mid * 2 + (fast == null ? 0 : 1);

		if (len == last) // if remove first ele of list
			return head.next; // can do head = head.next ... then return head also

		// NOTE: start/end are just to mov slow ... to prev ele to Remove N-th Node
		int end = len - last;
		int start = mid + 1;

		if (end <= mid) {
			slow = head; // move to start again
			start = 1;
		}

		for (int i = start; i < end; ++i) // move pointer to one element before
			slow = slow.next;

		slow.next = slow.next.next; // logic
		return head;
	}
}
