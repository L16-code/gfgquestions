import java.util.*;
import java.io.*;
public class jalan3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of guest");
        int guest=sc.nextInt(); 
        int[] guestage=new int[guest];
        for(int i=0; i<guest; i++){
            System.out.println("enter the age of guest" +(i+1));
            guestage[i]=sc.nextInt();
        }
        int result = new zoo().total(guestage);
        System.out.println(result);
        System.out.println("Zoo Entrance");
        System.out.println("Number of Guests: " + guest);
        for(int i = 0; i < guest;i++){
            System.out.println("Guests' Ages: " + guestage[i]);
        }
        System.out.println("Total Charges (INR): " + result);
    }
}
class zoo{
    public int total(int[] guestAges) {
        int totalCharge = 0;
        for (int i=0; i<guestAges.length; i++) {
            if (guestAges[i] <= 2) {
                totalCharge += 0;
            } else if (guestAges[i] < 18) {
                totalCharge += 100;
            } else if (guestAges[i] < 60) {
                totalCharge += 500;
            } else {
                totalCharge += 300;
            }
        }
        return totalCharge;
    }
    
}