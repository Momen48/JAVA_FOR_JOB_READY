public class Student {

private String name;
private int marks;

Student(String name, int marks){
    this.name = name;
    this.marks = marks;
}
void setMarks(int marks){
    if(marks >= 0 && marks <= 100){
        this.marks = marks;
    }
}
void display(){
    System.out.println("Student " + name + " obtained " + marks);
}
}
