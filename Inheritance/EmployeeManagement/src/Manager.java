public class Manager extends Employee {
    protected double bonus;
    Manager(String name, double salary, double bonus){
        super(name, salary);
        this.bonus = bonus;
    }
    double totalSalary(){
        return salary + bonus;
    }

    @Override
    void display(){
        System.out.println(name);
        System.out.println(totalSalary());
    }
}
