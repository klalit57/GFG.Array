package GFG;

public class SearchInArray {
    public static int searchInArray(int []arr, int x){ //LinearSearch
       for(int i=0;i<arr.length;i++) {
           if(arr[i]==x){
             return i;
           }
       }
       return -1;
    }
    public static void main(String [] args){
        int [] arr = {20 , 5 , 7 , 25};

        System.out.println(searchInArray(arr,5));

    }
}
