import java.util.*;
class ll{
    
    public static void main(String[] args){
        LinkedList<String> l=new LinkedList<String>();
        l.addFirst("a");
        l.add("b");
        System.out.println(l);
        l.addLast("c");
        System.out.println(l);
        System.out.println(l.size());
        for(int i=0; i<l.size(); i++){
            System.out.print(l.get(i)+"->");
        }
        System.out.println("null");
        // for(int i=l.size(); i>0; i--){
        //     System.out.println(l.get(i)+"->");  

        // }
    }
}