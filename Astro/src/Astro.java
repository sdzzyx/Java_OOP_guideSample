import java.util.Scanner;
public class Astro {
    public static void main(String[] args){
        /*
         int time = 20;
         String result = (time < 18) ? "Good day." : "Good evening.";
         System.out.println(result);
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        if (age >= 20){
            System.out.print("YoU have an access. ");
        }else if (age >= 13) {
            System.out.print("You need to have a permission. ");
        }else {
            System.out.print("Access denied. ");
        }
    }
}