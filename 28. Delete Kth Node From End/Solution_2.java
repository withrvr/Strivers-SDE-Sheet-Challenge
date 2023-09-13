
public class Solution_2 {
	public static Node removeKthNode(Node head, int last) {
		if (head == null || last == 0)
			return head;

		if (head.next == null) // IMP: base condition
			return null;

		int count = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		// NOTE: now_count: len of link list

		if (count == last) // if remove first ele of list
			return head.next; // can do head = head.next ... then return head also

		count -= last; // now_count: ele from start to del

		// traverse to prev nth ele
		temp = head;
		while (--count > 0)
			temp = temp.next;

		temp.next = temp.next.next; // logic to del
		return head;
	}
}
