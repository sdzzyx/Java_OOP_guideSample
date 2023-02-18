import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        int[] numbers = {1, 2, 3, 4, 5,10, 20};

        //this method is also for loop
        Arrays.stream(numbers).forEach(System.out::println);


        //numbers.for  this method shows that the idea will show the for loop method
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //for (int i = 0; i < numbers.length; i++){
           // System.out.println(numbers[i]);
            //ENHANCED for loop
            //for (int number : numbers) {
            //            System.out.println(number); this is short method
        }
    }
    //}

