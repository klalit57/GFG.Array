package GFG;

public class SecondLargest {

    public static int secondLargest1(int [] arr){  //My Code
        int res=-1, largestidx=-1;
        if(arr[0]>arr[1]){
            res=1;
            largestidx=0;
        }
        if(arr[1]>arr[0]) {
            res = 0;
            largestidx = 1;
        }
        if(res >=0 && largestidx>=0 ) {
             for (int i = 2; i < arr.length; i++) {
                if (arr[i] > arr[largestidx]) {
                    res = largestidx;
                    largestidx = i;
                }
                if (arr[i] > arr[res] && arr[i] < arr[largestidx]) {
                    res = i;
                }
            }
        }
        return res;
    }

    public static int secondLargest2(int [] arr) {  //GFG Naive approach using largestElement code
        int largestIdx = largestElement4(arr);
        int res = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[largestIdx]) {
                if (res == -1) {
                    res = i;
                } else if (arr[res] < arr[i]) {
                    res = i;
                }
            }
        }
        return res;
    }

    public static int largestElement4(int []arr){ // gfg   O(N)
        int res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[res]){
                res=i;
            }
        }
        return res;
    }

    public static int secondLargest3(int [] arr){  //GFG efficient approach
        int res=-1, largestidx=0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[largestidx]) {
                    res = largestidx;
                    largestidx = i;
                }
                else if(arr[i]!=arr[largestidx]){
                       if (arr[i] > arr[res] || res==-1){
                        res = i;
                       }
                }
            }
        return res;
    }

    public static void main(String [] args){
        int [] arr= {5 , 15 ,2 ,50 , 25 ,95 , 47 , 6};

        //int [] arr= {10 , 10 ,10};
        int indexsl;

        indexsl=secondLargest1(arr);
        System.out.println("Second Largest index: "+indexsl+"\n Second Largest Element : ");

        indexsl=secondLargest2(arr);
        System.out.println("Second Largest index: "+indexsl+"\n Second Largest Element : ");

        indexsl=secondLargest3(arr);
        System.out.println("Second Largest index: "+indexsl+"\n Second Largest Element : ");

        int [] arr1= {10,10,10};
        indexsl=secondLargest1(arr1);
        System.out.println("Second Largest index: "+indexsl+"\n Second Largest Element : ");

    }
}
