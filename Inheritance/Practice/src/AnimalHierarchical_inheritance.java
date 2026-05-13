public class AnimalHierarchical_inheritance {
    void eat(){
        System.out.println("Animal eats");
    }
}

class Dog6 extends AnimalHierarchical_inheritance{
    void bark(){
        System.out.println("Dog barks");
    }
}
class cat extends AnimalHierarchical_inheritance{
    void meow(){
        System.out.println("Cat meows");
    }
}

class Main6{
    public static void main(String[] args) {
        Dog6 d = new Dog6();
        d.eat();
        d.bark();
        cat c = new cat();
        c.eat();
        c.meow();
    }
}