import java.util.*;
public class FourthBit{
public static boolean fbit(int n,int k){
    if(((n>>k)&1) == 0){
        return false;
    }
    return true;

}
public static void main(String[] args){
    int a=1,b=4;
    System.out.println(fbit(a,b));

}}