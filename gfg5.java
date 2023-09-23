import java.util.*;
import java.io.*;
public class gfg5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0; i<n; i++){
            // System.out.println(arr[i]);
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        // int prev=arr[n-1];
        // System.out.println(prev);
        for(int i=arr.length-1; i>=1; i--){
            // System.out.println(arr[i]);
            // int prev=arr[i];
            if(arr[i]==arr[i-1]){
                continue;
            }else{
                System.out.println(arr[i-1]);
            }
        }
    }
}
