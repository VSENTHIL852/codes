import java.util.*;
public class Anagram{
    public static void main(String[] args){
        String str1="senthil";
        String str2="lihtnes";
        char[] ch1=str1.toCharArray();

        char[] ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.equals(ch1,ch2));
    }
}