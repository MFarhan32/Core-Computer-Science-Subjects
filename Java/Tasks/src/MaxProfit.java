public class MaxProfit {
    static int maxProfit(int[] stock){

        int min = stock[0];
        int profit = 0;
        for (int i=1;i<stock.length;i++){

            if (min>stock[i]){
                min = stock[i];
            }

            if(stock[i]-min>profit){
                profit = stock[i]-min;
            }
        }
        return profit;

    }

    public static void main(String[] args){
        /*You are given an array where each element represents the stock price on that day.
        Find the maximum profit you can make by buying once and selling once.
        If no profit is possible, return 0.
        Note : first integer is buying price and after this price is selling price
        */
        int[] stock ={7,1,5,3,6,4};

        System.out.println(maxProfit(stock));
    }
}
