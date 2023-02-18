import java.time.LocalTime;
import java.util.Scanner;

interface Alarm {
    void setAlarm(String time);
    void showAlarm();
}
abstract class Weekday implements Alarm{

}

class Monday extends Weekday{
    private String time;

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Monday monday = new Monday();
        String alarm;

        System.out.print("Enter time for alarm in this format (HM:MM): ");
        alarm = sc.nextLine();
        monday.setAlarm(alarm);
        monday.showAlarm();
    }

    @Override
    public void setAlarm(String time) {
        this.time = time;
        LocalTime alarms = LocalTime.parse(time);
        LocalTime now = LocalTime.now();

        if(alarms.isAfter(now)){
            System.out.println("I'll wake you up later.");
        }else {
            System.out.println("Alarm is set for tomorrow!");
        }
    }

    @Override
    public void showAlarm() {
        return;
    }
}