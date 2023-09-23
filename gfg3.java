import java.util.*;
import java.io.*;
public class gfg3 {
    public static int missingnumber(int arr[],int n){
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            // System.out.println(arr[i]);
            if(arr[i]!=i+1){
                // continue;
                System.out.println(i+1);
                // arr[i]=i+1;
            }
            
            // else{
            //     System.out.println(i);
            // }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        missingnumber(arr,n);
    }
}
