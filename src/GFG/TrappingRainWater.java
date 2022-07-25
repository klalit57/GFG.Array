package GFG;

public class TrappingRainWater {
    public static int trappingRainWater1(int [] arr){   //MyCode
        int trapWater=0;
        int start=0;
        int end=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                start=i;
                break;
            }
        }
        for(int j=start+1;j<arr.length;j++){
            if(arr[j]>=arr[start]){
                end=j;
                break;
            }
        }
        int height=Math.min(arr[start], arr[end]);
        for(int k=start+1;k<end;k++){
            trapWater=(trapWater+(height-arr[k]));
        }
        return trapWater;
    }

    public static int trappingRainWater2(int [] arr){ //gfg Naive
        int res=0;
        for(int i=1;i<arr.length-1;i++){  //water stored between second to second last index only
            int lMax=arr[i];
            int rMax=arr[i];
            for(int j=0;j<i;j++){
                lMax=Math.max(lMax,arr[j]);   //first find lMax for second bar | again find lmax for third bar
            }
            for(int k=i+1;k<arr.length;k++){
                rMax=Math.max(rMax,arr[k]);   //first find lMax for second bar | again find rMax for third bar
            }
            res=res+((Math.min(lMax,rMax))-arr[i]); //find the water stored above second bar| find the water stored above third bar
        }
        return res;
    }

    public static int trappingRainWater3(int [] arr){  //gfg efficient
        int res=0;
        int [] lMax= new int[arr.length];
        int [] rMax= new int[arr.length];
        lMax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            lMax[i]=Math.max(arr[i],lMax[i-1]);
        }
        rMax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rMax[i]=Math.max(arr[i],rMax[i+1]);
        }
        for(int i=1;i<arr.length-1;i++){
            res=res+((Math.min(lMax[i],rMax[i]))-arr[i]);
        }
        return res;
    }
    public static void main(String [] args){
        int [] arr1 = {3,0,1,2,5};
        int [] arr2 = {3,2,1};

        System.out.println(trappingRainWater1(arr1));
        System.out.println(trappingRainWater1(arr2));

        System.out.println(trappingRainWater2(arr1));
        System.out.println(trappingRainWater2(arr2));

        System.out.println(trappingRainWater3(arr1));
        System.out.println(trappingRainWater3(arr2));
    }
}
