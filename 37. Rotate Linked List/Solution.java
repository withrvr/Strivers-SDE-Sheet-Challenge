
public class Solution {
	public static Node rotate(Node head, int k) {
		if (head == null || head.next == null)
			return head;

		Node point = head;
		int count = 1;

		while (point.next != null) {
			++count;
			point = point.next;
		}

		point.next = head;
		k %= count;
		// System.out.println(count);
		// System.out.println(k);
		// System.out.println(point.val);

		int end = count - k;

		// for (int i = 0; i < end; ++i)
		while (--end >= 0)
			point = point.next;

		// System.out.println(point.val);

		Node temp = point.next;
		point.next = null;
		return temp;
	}
}
