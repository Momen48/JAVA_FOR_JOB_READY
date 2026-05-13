public class EmployeeProtected {
    protected double salary = 12000;
}

class Manager extends EmployeeProtected{
    void displaySalary(){
        System.out.println("The Salary is: "+salary);
    }
}
class Main5{
    public static void main(String[] args) {
        Manager m = new Manager();
        m.displaySalary();
    }
}
