public class Student {
    String name;
    int age;
    static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 22;

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}