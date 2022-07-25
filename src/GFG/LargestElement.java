package GFG;

public class LargestElement {
    public static int getLargestElement1(int []arr){ // Mine code
        int idx=0;
        int x=arr[idx];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>x){
                x=arr[i];
                idx=i;
            }
        }
        return idx;
    }

    public static int getLargestElement2(int []arr){    //gfg Naive  O(N^2)
       for(int i=0; i<arr.length;i++){
           boolean flag= true;
           for(int j=0; j<arr.length;j++){
               if(arr[j]>arr[i]){
                   flag= false;
                   break;
               }
           }
           if(flag==true){
               return i;
           }
       }
           return -1;
    }

    public static int getLargestElement3(int []arr){ // gfg   O(N)
        int res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[res]){
                res=i;
            }
        }
        return res;
    }


    public static void main(String [] args){

        int [] arr= {5 , 15 ,2 ,50 , 25 ,95 , 47 , 6};
        int index = getLargestElement1(arr);
        System.out.println("Largest Element index :"+index+"\nLargest Element is : "+arr[index]);

        index = getLargestElement2(arr);
        System.out.println("Largest Element index :"+index+"\nLargest Element is : "+arr[index]);

        index = getLargestElement3(arr);
        System.out.println("Largest Element index :"+index+"\nLargest Element is : "+arr[index]);



    }
}
