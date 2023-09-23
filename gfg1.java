import java.util.Scanner;
public class gfg1 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    // int prev=0;
    // for(int i=1; i<=n; i++){
    //     prev=prev+i;
    // }
    long prev= (long) n*(n+1)/2;
    System.out.println(prev);
}
}