import java.util.*;
import java.io.*;
public class gfg6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        // System.out.println(a.length());
        // ispar(a);
        if(new solution().ispar(a)==true){
            System.out.println("balanced");
        }else{
            System.out.println("notbalanced");
        }
    }
}

class solution{
    static boolean ispar(String x){
        Stack <Character> st = new Stack<>();
        for(int i =0 ; i < x.length() ; i++){
            char ch = x.charAt(i);
            switch(ch){
                case ')':
                    if(st.isEmpty() || st.pop()!='(') return false;
                    break;
                case ']':
                    if(st.isEmpty() || st.pop()!='[') return false;
                    break;
                case '}':
                    if(st.isEmpty() || st.pop()!='{') return false;
                    break;
                default:
                    st.push(ch);
                    break;
            }
            
        }
        if(st.isEmpty()) return true;
            return false;
    }
}