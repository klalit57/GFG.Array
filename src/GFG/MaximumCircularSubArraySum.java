package GFG;

public class MaximumCircularSubArraySum {
    public static int maximumCircularSubArraySum(int [] arr){
        int maxSum=arr[0];
        for(int i=0;i<arr.length;i++){
            int currMax=arr[i];
            int currSum=arr[i];
            for(int j=1;j<arr.length;j++){
                int idx=(i+j)%arr.length;
                currSum+=arr[idx];
                currMax=Math.max(currMax,currSum);
            }
            maxSum=Math.max(maxSum,currMax);
        }
        return maxSum;
    }
    public static void main(String [] args){

    }
}
