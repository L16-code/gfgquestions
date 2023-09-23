import java.util.*;
import java.io.*;
public class gfg7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        StringBuilder b=new StringBuilder(a);
        // int b;
        // Stack<Character> st = new Stack<Character>();
        // for(int i=0;i<a.length();i++){
        //     st.push(a.charAt(i));
        // }
        // int cas=0;
        // int i=0;
        // while(!st.isEmpty()){
        //     if(st.peek()==a.charAt(i)){
        //         cas=1;
        //         st.pop();
        //     }else{
        //         cas=0;
        //         break;
        //     }
        //     i++;
            
            
        // }
        // while(st.isEmpty()){
        //         // return 1;
        //         System.out.println('1');
        //     }
        // System.out.println(cas);
        // while(a.length()){
            // b=a.length()%10;
            // System.out.println(b);
        // }
        String rev=b.reverse().toString();
        // System.out.println(rev);
        if(rev.equals(a)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
    
}
