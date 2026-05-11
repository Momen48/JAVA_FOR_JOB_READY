public class Car {
    String brand;

    void start(){
        System.out.println(brand+ " is started");
    }
    void stop(){
        System.out.println(brand+ " is stopped");
    }

    static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.start();

        Car c2 = new Car();
        c2.brand = "Audi";
        c2.stop();
    }
}
