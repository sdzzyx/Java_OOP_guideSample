import java.util.Scanner;
class Animal{
    private String name;
    private int age;

    public void setName(String name){

        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
}
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Animal a = new Animal();

        System.out.println("Enter an animal name: ");
        a.setName(sc.nextLine());
        System.out.println("Enter animal age: ");
        a.setAge(sc.nextInt());

        System.out.println("Animal name is " + a.getName() + " and the age is " + a.getAge());
    }
}
