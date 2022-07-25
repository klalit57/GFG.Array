package GFG;

public class LeftRotateArray {
    public static int[] leftRotateByOne1(int [] arr){   //left rotate by d place
        int [] temp = new int[1];
            temp[0]=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
            arr[arr.length-1]=temp[0];
        return arr;
    }

    public static int[] leftRotateByD1(int [] arr , int d){
        for(int i=0;i<d;i++){
            arr=leftRotateByOne1(arr);
        }
        return arr;
    }

    public static int[] leftRotateByD2(int [] arr , int d){
        int temp [] = new int[d];
        for(int j=0;j<d;j++){
            temp[j]=arr[j];
        }
        for(int i=0;i<arr.length-d;i++){
            arr[i]=arr[i+d];
        }
        for(int k=0;k<d;k++){
            arr[arr.length-d+k]=temp[k];
        }
        return arr;
    }

    public static int[] leftRotateByD3(int [] arr , int d){
        arr=reverseArray2(arr,0,d-1);
        arr=reverseArray2(arr,d,arr.length-1);
        arr=reverseArray2(arr,0,arr.length-1);
        return arr;
    }
    public static int []  reverseArray2(int [] arr , int low , int high){
        while(high>low){
            int temp= arr[low];
            arr[low]=arr[high];
            arr[high]= temp;
            low++;
            high--;
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

        int [] arr ={8,5,0,10,0,20,0,50,10,5,0,9};

        printArray(arr);

        printArray(leftRotateByOne1(arr));

        printArray(leftRotateByD1(arr,2));

        printArray(leftRotateByD2(arr,2));

        printArray(leftRotateByD3(arr,2));

    }
 }
