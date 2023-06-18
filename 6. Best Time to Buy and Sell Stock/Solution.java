import java.util.ArrayList;

public class Solution {
	public static int maximumProfit(ArrayList<Integer> prices) {
		int max_profit = 0;
		int min_buy = Integer.MAX_VALUE; // prices.get(0);

		for (Integer val : prices) {
			min_buy = Math.min(min_buy, val);
			max_profit = Math.max(max_profit, val - min_buy);
		}

		return max_profit;
	}
}
