package GFG;  //Inset delete in array

public class InsertDeleteINArray {
    public static int insertElement(int [] arr, int size , int filled , int x , int pos){
       if(size==filled){
           return -1;
       }
       for(int i=filled-1; i>=pos-1;i--){
           arr[i+1]=arr[i];
       }
       arr[pos-1]=x;
       filled=filled+1;
        printArray(arr,filled);
       return filled;
    }

    public static int deleteElementByPosition(int [] arr,int filled ,int pos){
        arr[pos-1]=0;
        for(int i=pos;i<filled;i++ ){
            arr[i-1]=arr[i];
        }
        arr[filled-1]=0;
        filled=filled-1;
        printArray(arr,filled);
        return filled;

    }

    public static int deleteElementByValue(int [] arr, int filled , int x){
        int i;
        for(i=0;i<filled;i++){
            if(arr[i]==x)
                break;
        }
        if(i==filled){
            return filled;
        }
        for(int j=i;j<filled;j++){
            arr[j]=arr[j+1];
        }
        filled=filled-1;
        printArray(arr,filled);
        return filled;


    }


    public static void printArray(int []arr , int filled){
        for(int i=0;i<filled;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int [] arr = new int[10];
        arr[0]=5;
        arr[1]=10;
        arr[2]=20;
        int filled=3;

        printArray(arr, filled); //5 10 20

        //5 7 10 20
        filled = insertElement(arr,arr.length,3,7,2);

        //5 7 50 10 20
       filled= insertElement(arr,arr.length,filled,50,3);

       //5 7 10 20
      filled =deleteElementByPosition(arr, filled ,3);

      // 5 10 20
      filled=deleteElementByPosition(arr, filled ,2);

       //5 10 20 0 0 0 0 0 0 0
      printArray(arr, 10);

      //5 20
      filled=deleteElementByValue(arr, filled ,10);

        //5 20 0 0 0 0 0 0 0 0
      printArray(arr, 10);
    }
}
