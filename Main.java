abstract class animal{
    abstract void walk();
}
class horse extends animal{
    public void walk(){
        System.out.println("walk on 4");
    }
}
class chicken extends animal{
    public void walk(){
        System.out.println("walk on 2");
    }
}
public class Main {
    public static void main(String[] args){
        horse horse = new horse();
        horse.walk();
        // animal animal = new animal();
        // animal.walk();
    }
    
}
