public class Employee
{
    String name;
    double salary;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
    public  double calculatePay()
    {
        salary += salary * 0.25;
        return salary;
    }
    public void  display()
    {
        System.out.println(name + " EARNS " + calculatePay());
    }
}
