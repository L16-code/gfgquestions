import java.util.*;
import java.io.*;
public class gfg8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String temp="";
        Stack<String> st = new Stack<String>();
        for(int i=0; i<a.length();i++){
            if(a.charAt(i)!='.'){
                temp+=a.charAt(i);
            }
            else{
                st.push(temp);
                temp="";
            }
        }
        st.push(temp);
        String res="";
        while(!st.isEmpty()){
            // res=
            String pre=st.pop();
            res+=pre+" ";
        }
        System.out.println(res.substring(0, res.length()-1));
        // StringBuilder b=new StringBuilder(a);
        // String rev=b.reverse().toString();
        // System.out.println(rev);
    }
}
