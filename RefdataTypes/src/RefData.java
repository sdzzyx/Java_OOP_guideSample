import java.time.LocalTime;
import java.time.LocalDate;
public class RefData {
    public static void main(String[]args){
        String name = new String("Lenard");
        System.out.println(name.toLowerCase());
        //LocalTime now = LocalTime.now();
        LocalDate now = LocalDate.now();
        System.out.println(now);

        System.out.println(Math.abs(-10));
        //it converts a negative number to positive
        System.out.println((int)Math.pow(5, 2));
        //it shows the power of 5 to the power of 2 which is 5*5 is 25
        //if you want a whole number to show simply System.out.println(int) (Math.pow(5, 2))

        System.out.println((int)Math.sqrt(25));//this method on how to get the square root of a number

        int x;
        for(x = 0; x < 1000; x++ ){
            System.out.println("I fucking love you!");
        }





    }
}
