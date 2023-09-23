import java.util.*;
import java.io.*;
public class merell {
    public static void main(String[] args){
        LinkedList<Integer> l1=new LinkedList<Integer>();
        LinkedList<Integer> l2=new LinkedList<Integer>();
        LinkedList<Integer> l4=new LinkedList<Integer>();
        ArrayList<Integer> l3=new ArrayList<Integer>();

        l1.add(5);
        l1.add(10);
        l1.add(15);
        l1.add(40);
        l2.add(2);
        l2.add(3);
        l2.add(20);
        // l2.add("7");
        // l1.addLast("Null");
        // l2.addLast("Null");


        for(int i=0; i<l1.size(); i++){
            // System.out.print(l1.get(i));
            l3.add(l1.get(i));
        }
        System.out.println(" ");
        for(int i=0; i<l2.size(); i++){
            // System.out.print(l2.get(i));
            l3.add(l2.get(i));
        }
        Collections.sort(l3);
        for(int i=0; i<l3.size(); i++){
            System.out.print(l3.get(i));
        }
        for(int i=0;i<l3.size();i++){
            l4.add(l3.get(i));
        }
        // l4.removeLast();
        System.out.println("");
        for(int i=0; i<l4.size(); i++){
            System.out.print(l4.get(i)+"->");
            // l3.add(l2.get(i));
        }
    }
}
