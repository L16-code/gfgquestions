import java.util.*;
public class missing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> miss = new ArrayList<Integer>();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        for(int i=0; i<n; i++){
            sum-=arr[i];
        }
        // return sum;
        System.out.println(sum); 
        // for(int i=0; i<miss.size(); i++){
        //     System.out.println(miss.get(i));
        // }
    }
    
}
