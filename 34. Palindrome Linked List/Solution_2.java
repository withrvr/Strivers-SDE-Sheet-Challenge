// move to very last node using recursion
// then while coming back from recursion
// n checking from head ... then moving head

class Solution {
	ListNode head;

	public boolean check(ListNode point) {
		if (point != null) {
			// last check was false ... no use of checking more ... str is not Palindrome
			if (!check(point.next)) // check(point.next) == false
				return false;

			if (point.val != head.val) // no match
				return false;

			head = head.next; // move from front
		}

		return true;
	}

	public boolean isPalindrome(ListNode root) {
		this.head = root; // store first node
		return check(root);
	}
}
