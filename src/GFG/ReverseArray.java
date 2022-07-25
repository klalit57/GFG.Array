package GFG;

public class ReverseArray {
    public static int []  reverseArray1(int [] arr){ //My Code  by creating new array without altering the current array
        int [] reverseArray= new int[arr.length];

        for(int i=0;i<arr.length;i++){
            reverseArray[arr.length-i-1]= arr[i];
        }
        return reverseArray;
    }

    public static void  printArray(int [] arr){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int []  reverseArray2(int [] arr){  //GFG Approach reversing the arr itself without creating new array
        int low=0, high=arr.length-1;
        while(high>low){
            int temp= arr[low];
            arr[low]=arr[high];
            arr[high]= temp;
            low++;
            high--;
        }
        return arr;
    }


    public static void main(String [] args){

        int [] arr = {5 , 10 , 18 , 20 , 50 , 80};
        arr= reverseArray1(arr);
        printArray(arr);

        reverseArray2(arr);
        printArray(arr);



    }
}
