import java.util.*;
public class RemoveDup{
    public static void main(String[] args){
       
         int[] b={10,20,30,40,50,10,30};
        HashSet<Integer> set=new HashSet<>();
        for(int num: b){
            set.add(num);
        }
        
        System.out.println(set);
    }
}