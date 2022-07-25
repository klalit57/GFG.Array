package GFG;

public class FrequencyInArray {
    public static void frequencyInArray1(int [] arr){  //MyCode
        int temp = arr[0]; int i=1; int freq=1;
        while(i<arr.length){
            if(arr[i]==temp){
                freq++;
            }
            if(arr[i]!=temp || i==arr.length-1){
                System.out.println("Element :"+temp+" frequency :"+freq);
                freq=1;
                temp=arr[i];
            }
            i++;
        }
    }

    public static void frequencyInArray2(int [] arr){  //gfg solution
        int freq=1;
        int i=1;
        while(i<arr.length){
            while(i<arr.length && arr[i]==arr[i-1]){
                freq++;
                i++;
            }
            System.out.println("Element :"+arr[i-1]+" Frequency: "+freq);
            i++;
            freq=1;
        }
        if(arr.length==1 || arr[arr.length-1]!=arr[arr.length-2]){
            System.out.println("Element :"+arr[arr.length-1]+" Frequency: "+1);
        }
    }

    public static void main(String [] args){
        int [] arr1={10,10,10,25,30,30};
        int [] arr2={10,10,10,10};

        frequencyInArray1(arr1);

        frequencyInArray1(arr2);

        frequencyInArray2(arr1);

        frequencyInArray2(arr2);
    }
}
