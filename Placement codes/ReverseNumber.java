import java.util.*;
public class ReverseNumber{
    public static void main(String[] args){
        int a=123,temp=0;
        while(a>0){
             int d=a%10;
            temp=temp*10+d;
            a=a/10;


        }
        System.out.println(temp);

    }
}