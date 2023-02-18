import java.util.Scanner;
class Animal{
    public void speak(){
        System.out.println("Animal goes brrrr!");
    }
}

class Dog extends Animal{
    public void speak(){

        System.out.println("Dog goes bark bark!");
    }
}

class Cat extends Animal{
    public void speak(){

        System.out.println("Cat goes meow meow!");
    }
}

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        Animal animal;
        System.out.println("What animal do you want?");
        System.out.print("1(Dog): or 2(Cat): ");
        int choice = sc.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }else{
            System.out.println("Invalid input!");
            animal = new Animal();
            animal.speak();
        }
    }
}