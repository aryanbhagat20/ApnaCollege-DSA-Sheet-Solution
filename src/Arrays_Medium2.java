//Best time to Buy and Sell Stock - (Amazon + Flipkart + Goldman Sachs + Intuit + MakeMyTrip + Microsoft + Ola + Cabs + Oracle + Paytm + Pubmatic + Quikr + Salesforce + Sapient + Swiggy + Walmart + Media.net + Google)
//Leetcode Problem - 121

public class Arrays_Medium2 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int buy_price = prices[0]; //buy_price is the price at which we bought the stock
        int profit = 0; //At beginning the minimum profit is zero

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < buy_price) {
                buy_price = prices[i];
            }
            else if(prices[i] - buy_price > profit) {
                profit = prices[i] - buy_price;
            }
        }

        System.out.println("Maximum Profit is : " + profit);

    }
}
