import java.util.Arrays;

public class stringbackrev {
    public static void main(String[] args){
        String s ="lavish";
        StringBuilder sb=new StringBuilder();
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        int n=arr.length;
        // System.out.println(n);
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]);
            sb.append(arr[i]);
        }
        System.out.println(sb);
        System.out.println("");
        for (char c : arr) {
            System.out.print(c);
        }
        // for
        // sb.reverse();

    }
}
