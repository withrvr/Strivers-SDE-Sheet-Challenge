public class Solution {
	public static boolean isPalindrome(LinkedListNode<Integer> slow) {
		LinkedListNode<Integer> fast = slow, prev = null, temp = null;

		// reverse the left side list
		while (fast != null && fast.next != null) {
			fast = fast.next.next; // traverse

			// logic
			temp = slow.next;

			slow.next = prev;
			prev = slow;

			slow = temp;
		}

		if (fast != null) // if odd no of ele
			slow = slow.next; // move right side by one

		// prev: left side in reverse order
		// slow: right side
		// checking
		while (prev != null) { // same (slow!=null)
			if (prev.data != slow.data)
				return false;

			prev = prev.next;
			slow = slow.next;
		}

		return true;
	}
}