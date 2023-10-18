import java.util.*;
import java.io.*;
public class paranthesis {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
         Stack<Character> st = new Stack<>();
        for(int i=0; i<s.size(); i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
                continue;
            }
            

        }
        // while(s.length>0){
        //     switch
        // }

    }
    
}
