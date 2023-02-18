import java.util.Scanner;
public class Account {
    public static void main(String[]args){
    char ch;
    do {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();

        if(username.equals("lnrd05") && password.equals("lnrd05")){
            System.out.println("Welcome User!");
            break;
        }else {
            System.out.println("Access Denied!");
        }
        System.out.println("Do you want to continue? " + "Y for yes/ N for no");
        ch = sc.nextLine().charAt(0);
        if(ch == 'N' || ch == 'n'){
            System.out.println("Goodbye!");
        }
    }while (ch == 'y' || ch == 'Y');
    }
}
