import java.util.Scanner;

public class string01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count0=0 , count1=0;
        for(int i=0;i<s.length();i++){
            char first = s.charAt(i);
            int value = Character.getNumericValue(first);
            if(value==0){
                count0++;
            }
            else{
                count1++;
            }
        }
        System.out.println("no. of zeroes"+count0+"no. of ones"+count1);
    }
    
}
