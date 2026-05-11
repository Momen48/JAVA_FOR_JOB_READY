public class Employee {
    String name;
    double salary;

    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.name = "John";
        e1.salary = 20000;

        Employee e2 = new Employee();
        e2.name = "Jamila";
        e2.salary = 30000;

        System.out.println("Employee "+e1.name + " earns " + e1.salary);
        System.out.println("Employee "+e2.name + " earns " + e2.salary);

    }
}
