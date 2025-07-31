import java.util.*;
public class Armstrong{
    public static void main(String[] args){
        int a=153,sum = 0, temp = a;
        while(a>0){
            int d=a%10;
            sum=sum+d*d*d;
            a/=10;

        }
        if(temp ==sum )
        {
            System.out.println("arms");

        }
        else{
            System.out.println("not a arms");
        }
    }
}