public class StudentCons {
    String name;
    int age;
    //this constructor returns null as instance var is shadowed by local vae
    StudentCons(String name, int age){
        name = name;
        age = age;
    }
    StudentCons(String n ){
        this.name = n;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
    void display1(){
        System.out.println(name);
    }

    static void main(String[] args) {
        StudentCons s1 = new StudentCons("John", 22);
        s1.display();

        StudentCons S2 = new StudentCons("Jane");
        S2.display1();
       // S1 will print null

    }
}
