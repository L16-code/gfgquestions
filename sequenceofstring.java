import java.util.*;
public class sequenceofstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        int prev=0;
        int count=0;
        for(int i=0; i<s.length();i++){
            prev=s.charAt(i);
            for(int j=0;j<s.length();j++){
                if(prev==s.charAt(j)){
                count++;
            }
            else{
                System.out.println(count + prev);
            }
            }
            
        }
    }
}