import java.util.Scanner;

abstract class Animal{
    public abstract void eat();

    public abstract void sleep();

    public abstract void makeSound();

}

abstract class Bird extends Animal{
    @Override
    public void eat() {
        System.out.print("Birds loves to eat worms ");
    }

    @Override
    public void sleep() {
        System.out.println("and sleeps 10-12 hours a day");
    }

    @Override
    public void makeSound() {
        System.out.println("Tweet tweet");
    }
}

abstract class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat loves to eat fish");
    }

    @Override
    public void sleep() {
        System.out.println("and sleeps 5-10 hours a day");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
}

abstract class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog loves to eat meat");
    }

    @Override
    public void sleep() {
        System.out.println("and sleeps 8-9 hours a day");
    }

    @Override
    public void makeSound() {
        System.out.println("Arf arf");
    }
}

public class RunAnimal {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char press = sc.nextLine().charAt(0);

        switch (press) {
            case 'B':
            case 'b':
                Bird b = new Bird() {
                };
                b.eat();
                b.sleep();
                b.makeSound();
                break;

            case 'C':
            case 'c':
                Cat c = new Cat() {
                };
                c.eat();
                c.sleep();
                c.makeSound();
                break;
            case 'D':
            case 'd':
                Dog d = new Dog() {
                };
                d.eat();
                d.sleep();
                d.makeSound();
                break;
        }
}
}
