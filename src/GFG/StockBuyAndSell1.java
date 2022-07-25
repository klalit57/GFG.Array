package GFG;

public class StockBuyAndSell1 {
    public static int stockProfitMaximise1(int [] arr){  //MyCode
        int profit=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                profit=profit+(arr[i+1]-arr[i]);
            }
        }
        return profit;
    }
    public static int profitMaximise2(int [] arr, int start , int end){ //gfg Naive solution
        if(start>=end){
            return 0;
        }
        int profit=0;
        for(int i=start;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(arr[j]>arr[i]){
                    int currProfit= ((arr[j]-arr[i])+(profitMaximise2(arr,start,i-1))+(profitMaximise2(arr,j+1,end)));
                    profit= Math.max(profit,currProfit);
                }
            }
        }
        return profit;
    }
        public static void main (String [] args){
        int [] arr1 = {1,5,3,8,12};
        int [] arr2 = {30,20,10};
        int [] arr3 = {10,20,30};
        int [] arr4 = {1,5,3,1,2,8};

        System.out.println(stockProfitMaximise1(arr1));
        System.out.println(stockProfitMaximise1(arr2));
        System.out.println(stockProfitMaximise1(arr3));
        System.out.println(stockProfitMaximise1(arr4));
    }
}
