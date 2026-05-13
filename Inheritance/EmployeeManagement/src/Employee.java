public class Employee {
    protected double salary;
    protected String name;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name + " Salary: " + salary);
    }
}
