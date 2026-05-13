public class AnimalBasic {
    void eat(){
        System.out.println("Animal eats");
    }
}
class Dog1 extends AnimalBasic{
    void bark(){
        System.out.println("Dog barks");
    }
}
class Main1{
    public static void main(String[] args) {
        Dog1 d1 = new Dog1();
        d1.eat();
        d1.bark();
    }
}
