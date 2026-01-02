public class buyAndSellStocks {

    public static int buysell(int prices[]) {
        int buyStock = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyStock < prices[i]) {
                int profit = prices[i] - buyStock;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyStock = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 2, 4};

        int result = buysell(prices);   // store returned value
        System.out.println(result);     // print result
    }
}
