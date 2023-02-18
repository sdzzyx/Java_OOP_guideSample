public class WeakEnemy extends Enemy{
    WeakEnemy(){
        name = "Enemy 2. My name is Godzilla!";
        hp = 50;
    }

    @Override
    void dialog() {
        System.out.println("I am " + name);
        System.out.println("HP: " + hp);
    }
}
