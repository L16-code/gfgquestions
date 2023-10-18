import java.util.Scanner;

public class stirngpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            // String k=s.charAt(i);
            // String c = s.charAt(i);
            char first = s.charAt(i);
            int value = Character.getNumericValue(first);
            for (int j = 0; j < value; j++) {
                System.out.println("*");
            }
        }
        // int length = 0;
        // long temp = s;
        // while (temp <= number) {
        // length++;
        // temp *= 10;
        // }
        // return length;
        // String s1 = "12345";
        // int value = Integer.parseInt(s1);
        // System.out.println(value);

    }

}
