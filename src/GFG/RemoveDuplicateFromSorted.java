package GFG;

public class RemoveDuplicateFromSorted {
    public static int[] removeDuplicateFromSorted1(int [] arr , int size){//My Code
        int res=1;
        for(int i=1; i<arr.length;i++){
            if(arr[res-1]!=arr[i]){
                arr[res]=arr[i];
                res+=1;
            }
        }
        for(int j=res;j<arr.length;j++){
            arr[j]=0;
        }
        return arr;
    }
    public static int[] removeDuplicateFromSorted2(int [] arr , int size){   //gfg naive approach
        int [] temp = new int[arr.length];
        temp[0]= arr[0];
        int res = 1;
        for(int i=1;i<arr.length;i++){
            if(temp[res-1]!=arr[i]){
                temp[res]=arr[i];
                res+=1;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]= temp[i];
        }
        return arr;
    }

    public static void  printArray(int [] arr){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int [] arr = {10 , 20 , 20 , 30 , 30 , 30 , 50 , 50 , 50 };

        printArray(removeDuplicateFromSorted1(arr,arr.length));

        printArray(removeDuplicateFromSorted2(arr,arr.length));
    }
}
