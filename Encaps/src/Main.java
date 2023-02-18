class Student{
     private String name;
     private int age;
    public Student(){
        name = "No name yet.";
        age = 0;
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

}
public class Main {
    public static void main(String[]args){
        Student s1 = new Student();
        System.out.println("Student name is: " + s1.getName());
        System.out.println("Student age is: " + s1.getAge() + "\n");

        Student s2 = new Student("Lenard", 20);
        System.out.println("Student name: " + s2.getName());
        System.out.println("Student age: " + s2.getAge());
    }
}