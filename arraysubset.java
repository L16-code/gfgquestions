import java.util.*;
public class arraysubset{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[m];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for(int i=0;i<m;i++){
            // arr1[i] = sc.nextInt();
            System.out.print(arr1[i]);
        }
        System.out.println();
        for(int i=0;i<n;i++){
            // arr1[i] = sc.nextInt();
            System.out.print(arr[i]);
        }
        int flag=0;
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(arr1[i]==arr[j]){
                flag=0;
            }else{
                flag=1;
            }
            }
        }
        
        if(flag==1){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
        // System.out.println("true");
    }
}
//8 4 5 3 1 7 9
//5 1 3 7 9