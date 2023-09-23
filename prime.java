import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> prime = new ArrayList<Integer>();
        int n = sc.nextInt();
        int count = 0,flg;
        for (int i = 1; i<=n; i++) {
            if(i==1 || i==0) 
                continue;
            flg=1;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    // count++;
                    flg=0;
                    break;
                }
            }
                if (flg == 1) {
                    // System.out.println(i);
                    prime.add(i);
                    // break;
                }
                // n- - ;
            
            }
            int size=prime.size();
            System.out.println(prime.get(size-1));
            //     System.out.println(prime.get(i));
        //  } 
    }
}
