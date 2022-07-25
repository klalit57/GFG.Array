package GFG;

public class IsArraySorted {

    public static boolean isArraySorted(int [] arr){ //My Code

        if(arr.length==0){
            System.out.println("No Element present");
            return false;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean isArraySorted2(int [] arr){ //GFG Naive
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String [] args){
        int [] arr1= {5 , 15 ,2 ,50 , 25 ,95 , 47 , 6};

        int [] arr2= {5 , 10 ,15 ,20 , 25 ,30 , 35 , 40};

        System.out.println(isArraySorted(arr1));

        System.out.println(isArraySorted(arr2));


    }
}
