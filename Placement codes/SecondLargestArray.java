import java.util.*;
public class SecondLargestArray{
    public static void main(String[] args){
        int[] arr={10,50,80,1,2,01,30,50,10,10,100};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=arr[arr.length-1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}