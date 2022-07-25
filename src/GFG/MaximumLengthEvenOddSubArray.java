package GFG;

public class MaximumLengthEvenOddSubArray {
    public static int maximumLengthSubArray1(int [] arr){   //MyCode
        int length=0;
        int curr=1;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]%2==0 && arr[i+1]%2!=0) || (arr[i]%2!=0 && arr[i+1]%2==0) ){
                curr++;
            }
            if(arr[i]%2==arr[i+1]%2){
                curr=1;
            }
            length=Math.max(length,curr);
        }
        return length;
    }

    public static int maximumLengthSubArray2(int [] arr){   //GFG Naive
        int res=1;
        for(int i=0;i<arr.length;i++){
            int curr=1;
            for(int j=i+1;j<arr.length;j++){
                if((arr[j]%2==0 && arr[j-1]%2!=0) || (arr[j]%2!=0 && arr[j-1]%2==0)){
                    curr++;
                }
                else{
                    break;
                }
            }
            res=Math.max(res,curr);
        }
        return res;
    }

    public static int maximumLengthSubArray3(int [] arr){  //gfg efficient Kadane's Algorithm
        int res=1;
        int curr=1;
        for(int j=1;j<arr.length;j++){
            if((arr[j]%2==0 && arr[j-1]%2!=0) || (arr[j]%2!=0 && arr[j-1]%2==0)) {
                curr++;
                res=Math.max(res,curr);
            }
            else{
                curr=1;
            }
        }
        return res;
    }
    public static void main(String [] args){
        int [] arr1 = {10,12,14,7,8};
        int [] arr2 = {7,10,13,14};
        int [] arr3 = {10,12,8,4};


        System.out.println(maximumLengthSubArray1(arr1));
        System.out.println(maximumLengthSubArray1(arr2));
        System.out.println(maximumLengthSubArray1(arr3));


        System.out.println(maximumLengthSubArray2(arr1));
        System.out.println(maximumLengthSubArray2(arr2));
        System.out.println(maximumLengthSubArray2(arr3));

        System.out.println(maximumLengthSubArray3(arr1));
        System.out.println(maximumLengthSubArray3(arr2));
        System.out.println(maximumLengthSubArray3(arr3));

    }
}
