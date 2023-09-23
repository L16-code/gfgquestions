import java.util.*;
import java.io.*;
public class jalan4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of guest");
        int guest=sc.nextInt(); 
        int[] guestage=new int[guest];
        for(int i=0; i<guest; i++){
            System.out.println("enter the age of guest" +(i+1));
            guestage[i]=sc.nextInt();
        }
        System.out.println("Zoo Entrance Ticket:");
        System.out.println("Number of Guests: " + guest);
        for(int i = 0; i < guest;i++){
            System.out.println("Guests' Ages: " + guestage[i]);
        }
        
    }
}
    