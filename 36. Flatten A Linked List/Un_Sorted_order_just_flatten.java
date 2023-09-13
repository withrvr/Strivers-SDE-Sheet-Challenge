// convert to one list .... which can be traverse throw .child

class Un_Sorted_order_just_flatten {
	public static Node flattenLinkedList(Node head) {
		Node main = head, point;

		while (main != null) {
			point = main;

			if (point != null) {
				while (point.child != null) { // travel child
					point = point.child;
				}
			}

			point.child = main.next; // last child point ... to next node on main branch
			main = main.next;
		}

		return head;
	}
}
