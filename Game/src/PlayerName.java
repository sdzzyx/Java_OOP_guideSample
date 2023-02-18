import java.util.Scanner;
import java.util.Random;

interface PlayerName {
    void setName(String name);
}

interface Weapon{
    void setWeapon(String weapon);
}

interface Enemy extends Weapon {
    void setEnemy(String enemy);
}
abstract class Player implements PlayerName, Enemy{

}
class IPlayer extends Player {
    private static String name;
    private static String weapon;
    private static String enemy;

    @Override
    public void setName(String name) {
        System.out.print("Enter player name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Press 1 or 2 to select your game mode. \n1 - Story \n2 - Survival");
        char input = sc.nextLine().charAt(0);

        if(input == '1' || input == '2'){
            System.out.println("Press P to start playing, " + name + ".");
            input = sc.nextLine().charAt(0);
            if (input == 'P'){
                System.out.println("The game is ready. Type ====Gun or GUN==== to randomized pick a weapon");
            }
        }
    }
    @Override

    public void setWeapon(String weapon) {
        String[] z = {"AK47", "Shotgun", "M4"};
        Random ran = new Random();
        String s_ran = z[ran.nextInt(z.length)];
        Scanner s = new Scanner(System.in);
        String wp = s.nextLine();
        if ("GUN".equals(wp.toUpperCase())) {
            System.out.println("Type of gun: " + s_ran);
            System.out.println("Equipped! \nYou are now facing the enemy Type ===ENEMY=== ");
        }
    }
    @Override
    public void setEnemy(String enemy) {
        String[] e = {"Zombie", "Butcher", "Witch"};
        Random r = new Random();
        String r_ran = e[r.nextInt(e.length)];
        Scanner scan = new Scanner(System.in);
        String em = scan.nextLine();
        if (em.equals("Enemy")) {
            System.out.println("Your enemy is a " + r_ran + "!" + " You have successfully killed it!");
            System.out.println("==========================YOU WON==========================");
        } else {
            System.out.println("==========================YOU LOSE==========================");
        }
    }
    public static void main(String[]args){
        IPlayer ip = new IPlayer();
        ip.setName(name);
        ip.setWeapon(weapon);
        ip.setEnemy(enemy);
    }
}