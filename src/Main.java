import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal a = new Animal();

        System.out.print("Animal name: ");
        a.setAnimalName(sc.nextLine());
        System.out.print("Animal age: ");
        a.setAnimalAge(Integer.parseInt(sc.nextLine()));
        System.out.print("Animal species: ");
        a.setAnimalSpecies(sc.nextLine());

        System.out.println("The type of animal is " + a.getAnimalName() + " and it's age is " + a.getAnimalAge()
        + " and it's species is " + a.getAnimalSpecies() + ".");
    }
}