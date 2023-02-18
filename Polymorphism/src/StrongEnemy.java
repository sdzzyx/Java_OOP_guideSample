public class StrongEnemy extends Enemy {
    StrongEnemy(){
        name = "Enemy 1. My name is Thanos!";
        hp = 100;
    }

    @Override
    void dialog() {
        System.out.println("I am " + name);
        System.out.println("HP: " + hp);
    }
}
