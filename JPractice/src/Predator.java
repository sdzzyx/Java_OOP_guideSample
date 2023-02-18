interface Predator {
    void hunting();


    interface Prey {
        void flee();
    }

    class Eagle implements Predator {
        @Override
        public void hunting() {
            System.out.println("The Eagle is hunting");
        }

    }

    class Racoon implements Prey {
        public void flee() {
            System.out.println("The Racoon is fleeing");
        }
    }

    class Rabbit implements Predator, Prey {
        @Override
        public void hunting() {
            System.out.println("The Rabbit is either hunting smaller animal");
        }

        @Override
        public void flee() {
            System.out.println("The rabbit is either fleeing with larger animal");
        }
    }

    public static void main(String[]args){
        Eagle e = new Eagle();
        Racoon r = new Racoon();
        Rabbit rabbit = new Rabbit();

        e.hunting();
        r.flee();
        rabbit.flee();
        rabbit.hunting();
    }
}