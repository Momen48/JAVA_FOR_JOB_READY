public class Student extends Person {
    protected int marks;
    Student(String name, int marks){
        super(name);
        this.marks = marks;
    }
    void display(){
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}
