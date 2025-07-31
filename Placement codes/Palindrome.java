import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        int a=121,rev=0,ori = a;
        while(a>0){
            int digit=a%10;
            rev=rev*10+digit;

            a/=10;

        }
       if(rev == ori){
        System.out.print("pal");
       }
       else{
        System.out.print("not");
       }
    }
}