import java.util.Arrays;
import java.util.*;
public class anagram {
    public static void main(String[] args){
        String s="lavish";
        String b="avishl";
        // int arr[]=toArray(s);
        char[] arr1=s.toCharArray();
        Arrays.sort(arr1);
        char[] arr2=s.toCharArray();
        Arrays.sort(arr2);
        // for (char c : arr2) {
        //     System.out.println(c);
        // }
        if(Arrays.equals(arr1, arr2)){
            System.out.println("anangram");
        }else{
            System.out.println("not anagram");
        }


    }
    
}
