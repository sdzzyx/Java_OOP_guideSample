class Pattern{
    public void Display(){
        for (int i = 0; i < 10; i++){
            System.out.println("*");
        }
    }

    public void Display(char symbol){
        for (int i = 0; i < 10; i++){
            System.out.println(symbol);
        }
    }
}

public class Main {
    public static void main(String[]args){
        Pattern p = new Pattern();
        p.Display();
        System.out.println("\n");

        p.Display('#');

    }
}
