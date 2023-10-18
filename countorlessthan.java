import java.util.*;

public class countorlessthan {
    public static void  main(String[] args){
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
        // Arrays.sort(arr);
        // Arrays.sort(arr1);

        int count=0;
        ArrayList a1=new ArrayList();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i]>=arr1[j] ){
                    // a1.add
                    count++;
                }
            }
            a1.add(count);
            count=0;
        }
        for(int i=0;i<a1.size();i++){
            System.out.println(a1.get(i)); 
    }
}
}
