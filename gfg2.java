// import java.util.Scanner;
import java.util.*;
import java.io.*;
public class gfg2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //input
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        //logic
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(arr[i]==i){
                // System.out.print(arr[i]);
                al.add(i);

            }
            System.out.println(al.get(1));
        }
        //print
        // for(int i=1;i<n;i++){
        //     System.out.println(al.get(i));
        // }
    }
}
