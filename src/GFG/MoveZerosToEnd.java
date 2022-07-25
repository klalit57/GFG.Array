package GFG;

public class MoveZerosToEnd {
    public static int [] moveZerosToEnd1(int [] arr){   // gfg Naive solution
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]!=0){
                        arr[i]=arr[j];
                        arr[j]=0;
                        break;
                    }
                }
            }
       }
        return arr;
    }

    /*public static int [] moveZerosToEnd2(int [] arr){  //My Code
        int count=0;
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){

            }
            if (arr[i] != 0) {
                count++;
                if(i>idx && idx>0){
                    arr[idx] = arr[i];
                    arr[i] = 0;
                    idx=i;
                }
            }
        }
        return arr;
    }*/

    public static int [] moveZerosToEnd3(int [] arr){ //GFG efficient
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp= arr[count];
                arr[count]=arr[i];
                    arr[i] = temp;
                    count++;
            }
        }
        //while(count<arr.length){
       //   arr[count++]=0;
       // }
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

        printArray(moveZerosToEnd1(arr));

        //printArray(moveZerosToEnd2(arr));

        printArray(moveZerosToEnd3(arr));

    }
}
