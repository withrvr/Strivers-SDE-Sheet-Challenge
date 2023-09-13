public class Recursion {
	public static Node mergeTwoLists(Node list1, Node list2) {
		if (list1 == null)
			return list2;

		if (list2 == null)
			return list1;

		if (list1.data < list2.data) {
			list1.child = mergeTwoLists(list1.child, list2);
			return list1;
		} else {
			list2.child = mergeTwoLists(list1, list2.child);
			return list2;
		}
	}

	public static Node flattenLinkedList(Node head) {
		if (head == null || head.next == null)
			return head;

		// recur for list on right
		head.next = flattenLinkedList(head.next);

		// now merge
		head = mergeTwoLists(head, head.next);

		// return the head
		// it will be in turn merged with its left
		return head;
	}
}
