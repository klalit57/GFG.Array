package GFG;

public class InsertInArray {

    public static int insertInArray(int []arr, int nElements, int pos, int x){
        if(nElements==arr.length){
            return nElements;
        }
        for(int i=nElements-1;i>=pos-1;i--){
            arr[i+1]= arr[i];
        }
        arr[pos-1]=x;
        return nElements+1;
    }

    public static void  printArray(int [] arr){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String [] args){
        int [] arr = new int[5];
        arr[0]=5;
        arr[1]=10;
        arr[2]=20;

        System.out.println(insertInArray(arr,3,2, 7));
        printArray(arr);

    }
}
