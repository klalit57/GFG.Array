package GFG;

public class DeleteInArray {
    public static int  deleteInArray(int [] arr,int n, int x){
        int i;
        for(i=0;i<5;i++){
          if(arr[i]==x){
              break;
          }
        }
        if(i==n){
            return n;
        }
        for(int j=i;j<n-1;j++){
            arr[j]=arr[j+1];
        }
        arr[n-1]=0;
        return n-1;
    }

    public static void  printArray(int [] arr){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int [] arr = new int[5];
        arr[0]=3;
        arr[1]=8;
        arr[2]=12;
        arr[3]=5;
        arr[4]=6;
        printArray(arr);

        System.out.println(deleteInArray(arr,5,12));

        printArray(arr);

    }
}
