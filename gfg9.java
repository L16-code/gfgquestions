import java.util.*;
import java.io.*;
public class gfg9 {
    public static boolean check(String a,String b) {
        char[] arr=a.toCharArray();
        char[] ar=b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(ar);
        String c= new String(arr);
        String d= new String(ar);
        if(c.equals(d)){
            return true;
        }else
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        // int count=0;
        boolean result =check(a, b);
        System.out.println(result);
        
    }
    
}
