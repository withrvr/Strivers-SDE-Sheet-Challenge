public class Iterate {
	public static Node mergeTwoLists(Node list1, Node list2) {
		final Node res = new Node();
		Node point = res;

		while (list1 != null && list2 != null) {
			if (list1.data < list2.data) {
				point.child = list1;
				list1 = list1.child;
			} else {
				point.child = list2;
				list2 = list2.child;
			}
			point = point.child;
		}

		point.child = list1 != null ? list1 : list2;
		return res.child;
	}

	public static Node flattenLinkedList(Node first) {
		// Node first = head;
		// Node second = head.next;

		Node second = first.next;

		while (second != null) {
			first = mergeTwoLists(first, second);
			second = second.next;
		}

		return first;
	}
}
