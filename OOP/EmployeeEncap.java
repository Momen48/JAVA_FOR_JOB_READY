public class EmployeeEncap{
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    static void main(String[] args) {
        EmployeeEncap e1 = new EmployeeEncap();
        e1.setName("Jainab");
        e1.setSalary(15000);

        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}
