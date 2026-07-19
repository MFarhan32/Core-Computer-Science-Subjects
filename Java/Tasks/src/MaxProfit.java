import java.sql.SQLOutput;

public class MaxProfit {


    static void checkProfit(int[] stock, int profit){

        for (int i=0;i<stock.length-1;i++){
            for (int j=i+1;j<stock.length;j++){
                int prof=stock[j]-stock[i];
                if(prof>profit){
                    profit= prof;
                }
            }
        }
        if (profit>0){
            System.out.print("Profit is: "+ profit);
        }
        else{
            System.out.print("NO Profit");
        }
    }


    public static void main(String[] args){
        /*You are given an array where each element represents the stock price on that day.
        Find the maximum profit you can make by buying once and selling once.
        If no profit is possible, return 0.
        Note : first integer is buying price and after this price is selling price
        */

        int[] stock ={7,4,5,3,6,7};
        int profit =0;
        checkProfit(stock,profit);
    }
}
