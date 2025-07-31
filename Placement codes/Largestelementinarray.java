import java.util.*;
public class Largestelementinarray{
    public static void main(String[] args){
        int[] a={10,20,30,40,50,10,30};
        Arrays.sort(a);
        System.out.println(a[a.length-1]);
        
    }
}