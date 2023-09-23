import java.util.*;
public class pattern{
    static void square(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    static void inctriangle(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    static void dectriangle(int n){
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    static void righttriangle(int n){
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                System.out.print("  ");
            }
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    static void rightsidedtriangle(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<n; j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
    }
    static void reversehill(int n){
        for(int i=0; i<n; i++){
            for(int j=0;j<i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<n-1; j++){
                System.out.print("* ");
            }
            for(int j=i; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    static void hill(int n){
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                System.out.print("  ");
            }
            for(int j=0; j<i-1; j++){
                System.out.print("* ");
            }
            for(int j=0;j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
     static void diamond(int n){
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                System.out.print("  ");
            }
            for(int j=0; j<i-1; j++){
                System.out.print("* ");
            }
            for(int j=0;j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            for(int j=0;j<i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<n-1; j++){
                System.out.print("* ");
            }
            for(int j=i; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args){
        // square(5);
        // inctriangle(5);
        // dectriangle(5);
        // righttriangle(5);
        // rightsidedtriangle(5);
        // hill(5);
        // reversehill(5);
        diamond(5);

    }
}