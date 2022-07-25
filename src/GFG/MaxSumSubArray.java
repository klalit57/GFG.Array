package GFG;

public class MaxSumSubArray{
    public static int maxSumSubArray(int [] arr){  //GFG Naive , MyCode
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            int curr=0;
            for(int j=i;j<arr.length;j++){
                curr=curr+arr[j];
                res=Math.max(res,curr);
            }
          }
        return res;
    }

    public static void main(String [] args){
        int [] arr = {2,3,-8,7,-1,2,3};
        System.out.println(maxSumSubArray(arr));


    }
}
