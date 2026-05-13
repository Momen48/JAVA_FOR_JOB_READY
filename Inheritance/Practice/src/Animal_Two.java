public class Animal_Two {
    Animal_Two(){
        System.out.println("Animal_Two Eats");
    }
}
class Dog extends Animal_Two{
    Dog(){
        System.out.println("Dog 2 Barks");
    }
}
class Main{
    public static void main(String[] args) {
        Dog d1 = new Dog();
    }
}