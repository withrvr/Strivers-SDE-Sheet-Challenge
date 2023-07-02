/************************************************************
 *
 * Following is the linked list node structure:
 *
 * class LinkedListNode<T> {
 * T data;
 * LinkedListNode<T> next;
 *
 * public LinkedListNode(T data) {
 * this.data = data;
 * }
 * }
 *
 ************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		final LinkedListNode<Integer> head = new LinkedListNode<>(-1);
		LinkedListNode<Integer> point = head;

		while (first != null && second != null) {
			if (first.data < second.data) {
				point.next = first;
				first = first.next;
			} else {
				point.next = second;
				second = second.next;
			}

			point = point.next;
		}

		point.next = first != null ? first : second;

		return head.next;
	}
}
