import java.util.Scanner;

public class test1 {
    public static int today(int n, int arr[], int k) {
        if(k>arr.length){
            return 0;
        }else{

        
        int prev = 0;

        for (int i = 0; i < k; i++) {
            int c = arr[i] * 20 / 100;
            prev = prev + c;

        }

        int preve = 0;

        for (int i = k; i < arr.length; i++) {

            int e = arr[i] * 10 / 100;
            preve = preve + e;
 
        }
        return prev + preve;
    }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        // today(n,arr,k);
        // int d=2;
        // for(int i=d;i<=4;i++){
        // System.out.println(i);
        // }
        int result = today(n, arr, k);
        System.out.println(result);
        // for(int i=0; i<n; i++){
        // System.out.println(arr[i]);
        // }
        // System.out.println(k);
        // System.out.println(i);
    }
}
