class Solution {
	ListNode fast, mid;
	boolean result = true;

	public void check(ListNode slow) {
		if (fast == null) { // even
			mid = slow;
			return;
		} else if (fast.next == null) { // odd
			mid = slow.next;
			return;
		}
		// else { // this 2 line
		fast = fast.next.next; // fast: to find mid
		check(slow.next); // slow: to find mid .... then move then reverse order when comparing
		// }

		// when recursion come back .... left side of list .... in reverse order
		if (slow.val != mid.val)
			this.result = false;

		mid = mid.next; // right side of list
	}

	public boolean isPalindrome(ListNode root) {
		this.fast = root; // to find the mid
		check(root);

		return this.result;
	}
}
