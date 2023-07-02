// ref img: https://s1.ax1x.com/2018/08/24/P7OXSx.png

public class Solution {
	public static int findIntersection(Node first_head, Node second_head) {
		Node first = first_head, second = second_head;

		// travel like `∞`
		while (first != second) {
			first = first == null ? second_head : first.next;
			second = second == null ? first_head : second.next;
		}

		return second.data;
	}
}
