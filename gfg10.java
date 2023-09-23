import java.util.*;
import java.io.*;
public class gfg10 {
    public static void main(String[] args) 
    {   Stack <Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String rom=s.toUpperCase();
        String I="1",V="5";
        int value = Integer.parseInt(I)+Integer.parseInt(V);
        String result = String. valueOf(value) ;
        System.out.println(result);
        // System.out.println(s.toUpperCase());
        // for(int i=0;i<sc.length;i++) {
        //     char ch=s.charAt(i);
        //     if(ch=='I')
        // }
    }
}
