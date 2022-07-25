package GFG;

public class MaxConsecutive1s {
    public static int maxConsecutive1s1(int [] arr){  //MyCode   also GFG efficient
       int res=0;
       int currMax=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==1){
               currMax++;
               res=Math.max(res,currMax);
           }
           if(arr[i]==0){
               currMax=0;
           }
       }
       return res;
    }

    public static int maxConsecutive1s2(int [] arr){   //GFG Naive
        int res=0;
        for(int i=0;i<arr.length;i++){
            int curr=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==1){
                    curr++;
                }else{
                    break;
                }
            }
            res=Math.max(curr,res);
        }
        return res;
    }

    public static void main(String [] args){
        int [] arr1 = {0,1,1,0,1,0};
        int [] arr2 = {1,1,1,1};
        int [] arr3 = {0,0,0,0};
        int [] arr4 = {1,0,1,1,1,1,0,1,1};


        System.out.println(maxConsecutive1s1(arr1));
        System.out.println(maxConsecutive1s1(arr2));
        System.out.println(maxConsecutive1s1(arr3));
        System.out.println(maxConsecutive1s1(arr4));

        System.out.println(maxConsecutive1s2(arr1));
        System.out.println(maxConsecutive1s2(arr2));
        System.out.println(maxConsecutive1s2(arr3));
        System.out.println(maxConsecutive1s2(arr4));

    }
}
