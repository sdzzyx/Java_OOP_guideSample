//import java.util.Date; this method use to print the current date and time.
//Date now = new Date();
class Language {
    public void displayInfo() {
        System.out.println("I am a filipino.");
    }
}

class Java extends Language{
    @Override
    public void displayInfo() {
        System.out.println("Java Programming Language.");
    }
}

public class Main {

    public static void main(String[]args){
        Java j = new Java();
        j.displayInfo();

        Language l = new Language();
        l.displayInfo();
    }
}