public class AnimalMultiLevelInheritance {
    void eat(){
        System.out.println("Animal eats");
    }
}
class Dog2 extends AnimalMultiLevelInheritance{
    void bark(){
        System.out.println("Dog barks");
    }
}
class puppy extends Dog2{
    void cry(){
        System.out.println("Puppy cries");
    }
}

class Main2{
    public static void main(String[] args) {
        puppy p = new puppy();
        p.eat();
        p.bark();
        p.cry();
    }
}