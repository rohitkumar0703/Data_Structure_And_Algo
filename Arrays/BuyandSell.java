package Arrays;
// You are given an array prices where prices[i] is the price of a given stock on the 
// ith day. You want to maximize your profit by choosing a single day to buy one stock
// and choosing a different day in the future to sell that stock. 
// return the maximum profit you can achive from this transactio. If you cannot achieve any 
// profit. return 0
public class BuyandSell {
    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i]; // Update buy price if a better buying opportunity is found
            } else {
                int profit = prices[i] - buyPrice; // Calculate profit if selling at current price
                maxProfit = Math.max(maxProfit, profit); // Update max profit
            }
        }
        return maxProfit;
    } 

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices)); // Output should be 5
    }
}
// Time complexity will be BIG O(n)