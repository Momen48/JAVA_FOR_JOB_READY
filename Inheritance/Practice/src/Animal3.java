public class Animal3 {
    Animal3(String name){
        System.out.println("Super Called :  " + name + ".");
    }
}
class Dog3 extends Animal3{
    Dog3(){
        super("Dog");
        System.out.println("Dog3 Constructor");
    }
}
class Main3{
    public static void main(String[] args) {
        Dog3 d3 = new Dog3();
    }
}
