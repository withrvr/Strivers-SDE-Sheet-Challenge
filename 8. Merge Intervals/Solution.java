// temp ... act like start, end
// ie. last_interval/new_interval

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Interval {
	int start, finish;

	Interval(int start, int finish) {
		this.start = start;
		this.finish = finish;
	}
}

public class Solution {
	public static List<Interval> mergeIntervals(Interval[] intervals) {
		// IMP: sorting
		// according to start value .... first index value will be min
		Arrays.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

		List<Interval> list = new ArrayList<>();

		Interval temp = intervals[0];
		list.add(temp);

		for (Interval col : intervals) {
			if (temp.finish >= col.start) // overlap
				temp.finish = Math.max(temp.finish, col.finish);
			else { // no overlap
				list.add(col);
				temp = col;
			}
		}

		return list;
	}
}