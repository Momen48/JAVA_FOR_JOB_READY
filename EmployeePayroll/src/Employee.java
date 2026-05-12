public class Employee
{
    String name;
    double salary;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
    public  void calculatePay()
    {
        salary += salary * 0.25;
        System.out.println(name + " earns " + salary);
    }
}
