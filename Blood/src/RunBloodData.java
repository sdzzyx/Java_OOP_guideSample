import java.util.Scanner;
class BloodData {
    static String bloodType;
    static String rhFactor;

    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

    public BloodData(String bt, String rh){
        bloodType = bt;
        rhFactor = rh;
    }

    void display(){
        System.out.println(bloodType + rhFactor + " is added to the blood bank.\n");
    }
}

public class RunBloodData {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String bt,rh;

        System.out.println("Enter blood type of patient: ");
        bt = sc.nextLine();
        System.out.println("Enter the Rhesus factor (+ or -): ");
        rh = sc.nextLine();
        BloodData bd;

        if(bt.equals("")&&rh.equals("")){
            bd = new BloodData();
            bd.display();
        }
        else{
            bd = new BloodData(bt,rh);
            bd.display();
        }
        System.out.println("Enter blood type of patient: ");
        bt = sc.nextLine();
        System.out.println("Enter the Rhesus factor (+ or -): ");
        rh = sc.nextLine();
        BloodData bd2;
        if(bt.equals("")&&rh.equals("")){
            bd2 = new BloodData();
            bd2.display();
        }
        else{
            bd2 = new BloodData(bt,rh);
            bd2.display();
        }
    }
}
