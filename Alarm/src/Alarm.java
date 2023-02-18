import java.time.LocalTime;
import java.util.Scanner;

interface Alarm {
    void setAlarm(String time);
    void showAlarm();
}

abstract class Weekday implements Alarm{

}

class Monday extends Weekday{
    private static String time;

    @Override
    public void setAlarm(String time) {
        System.out.print("Enter time for alarm in this format (HM: MM): ");
        Scanner sc = new Scanner(System.in);
        time = sc.nextLine();
    }

    @Override
    public void showAlarm() {
        LocalTime alarm = LocalTime.parse(time);
        LocalTime now = LocalTime.now();
        if(alarm.isAfter(now)) {
            System.out.println("Alarm set tomorrow! ");
        } if(alarm.isBefore(now)) {
            System.out.println("I'll wake you up later! ");
        }
    }
    public static void main(String[] args) {
        Monday monday = new Monday();
        monday.setAlarm(time);
        monday.showAlarm();
    }
}