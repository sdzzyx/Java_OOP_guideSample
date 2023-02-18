import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        System.out.println("How old are you: ");
        int age = sc.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + year);

        if(age < 18){
            System.out.println("You are not an adult :(");
        }else {
            System.out.println("You are an adult :)");
        }
    }
}