public class Student {
    private String name;
    private int age;

    public Student(){
        name = "No name yet";
        age = 0;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[]args){
        Student s1 = new Student();
        Student s2 = new Student("Lenard", 20);

        System.out.println("Name: " + s1.name + "\n" + "Age: " + s1.age + "\n");
        System.out.println("Name: " + s2.name + "\n" + "Age: " + s2.age );
    }
}
