public class AnimalMethodOverriding {
    void sound(){
        System.out.println("Animal makes Sound");
    }
}
class Dog4 extends AnimalMethodOverriding {
    @Override
    void sound(){
        System.out.println("Dog makes Bark");
    }
}
class Main4{
    public static void main(String[] args) {
        Dog4 d4 = new Dog4();
        d4.sound();
    }
}