import java.util.*;
public class removespecialchar {
    public static void main(String[] args){
        String s= "#lav$i&s$h";
        String s2="lavi sh";
        String s3="aacbacc";
        // will remove the special characters from the string
        String p=s.replaceAll("[^a-zA-Z0-9]","");
        // will remove the spaces from the string 
        String q=s2.replaceAll("\\s","");
        String r=s3.replace("ac","");
        String t=r.replace("b","");
        System.out.println(t);
    }
    
}
