import java.util.*;
import java.io.*;
public class gfg4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // 
        // Vector<Integer> vec = new Vector<Integer>();
        // int[] arr;
        // int[] pri;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList arr = new ArrayList();
        for(int i=0;i<arr.size();i++){
            int a =sc.nextInt();
            arr.add(a);
        }
        // Arrays.sort(arr);
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
                }
        // System.out.println(arr);
        // for(int i=0;i<arr.length;i++){
            // int prev=arr[i];
            // if(arr[i+1]==prev){
            //     arrayList.add(prev);
            // System.out.println(arr[i]);
            // }
            
        }
        // for(int k:vec){
        //     System.out.println(k);
        // }
                
        // System.out.println("Array 1:" + arrayList);
    
}
