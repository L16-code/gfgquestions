import java.util.*;

public class ksmallestelement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
        
    }
}
