import java.util.*;
public class KthBit{
    public static boolean isbit(int n,int k){
        if(((1<<k)&n) == 0)
        {
            return false;
        }
        return true;

    }
    public static void main(String[] args){
        int a=8,b=2;
        System.out.println(isbit(a,b));
    }
}