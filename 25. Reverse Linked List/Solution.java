class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}

public class Solution {
	public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> curr) { // head node
		// new LinkedListNode<>(99);
		// LinkedListNode<Integer> curr = head;
		LinkedListNode<Integer> temp = null, prev = null;

		while (curr != null) {
			temp = curr.next; // traverse

			curr.next = prev; // logic

			prev = curr; // curr is prev now
			curr = temp; // traverse
		}

		return prev;
	}
}
