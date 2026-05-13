public class CarShowRoom {
    private String brand;
    private int price;

    public CarShowRoom(String brand, int price){
        this.brand = brand;
        this.price = price;
    }
    void display(){
        System.out.println("The brand "+brand + " has a price : " + price);
    }
}
