import java.util.Stack;

public class stackreverse {
    public static void main(String[] args){
        String s="lavish";
        StringBuilder n= new StringBuilder();
        // Stack<String> st = new Stack<String>();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            n.append(st.pop());
        }
        System.out.println(n);
    }
    
}
