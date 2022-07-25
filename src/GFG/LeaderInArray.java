package GFG;

public class LeaderInArray {
    public static void leaderInArray1(int [] arr){  //GFG not efficient
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    public static void leaderInArray2(int [] arr){
        int currLeader=arr[arr.length-1];
        System.out.print(currLeader+" ");
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>currLeader){
                currLeader=arr[i];
                System.out.print(currLeader+" ");
            }
        }
        System.out.println();
    }

    public static void  printArray(int [] arr){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String [] args){
        int [] arr= {7,10,4,10,6,5,2};

        printArray(arr);



        leaderInArray1(arr);

        leaderInArray2(arr);
    }
}
