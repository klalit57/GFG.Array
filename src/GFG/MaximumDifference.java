package GFG;

public class MaximumDifference {
    public static int maximumDifference1(int []arr){ //MyCode
        int res=0;
        int diff;
        for(int i=0;i<arr.length-1;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                diff = arr[j] - arr[i];
                if (diff > res) {
                    res = diff;
                }
            }
        }
      return res;
    }
    public static int maximumDifference2(int [] arr){  //GFG Naive
        int res= arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                res= Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
    }


    public static int maximumDifference3(int []arr){  // GFG efficient
        int res=arr[1]-arr[0], minVal=arr[0];
        for(int i=1;i<arr.length;i++) {
            res = Math.max(res, (arr[i]-minVal));
            minVal=Math.min(minVal,arr[i]);
        }
        return res;
    }

    public static void main(String [] args){
        int [] arr1={2,3,10,6,4,8,1};

        int [] arr2={7,9,5,6,3,2};



        System.out.println(maximumDifference1(arr1));

        System.out.println(maximumDifference1(arr2));

        System.out.println(maximumDifference2(arr1));

        System.out.println(maximumDifference2(arr2));

        System.out.println(maximumDifference3(arr1));

        System.out.println(maximumDifference3(arr2));

    }
}
