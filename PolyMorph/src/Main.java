class Vehicle{
    public void go(){

    }
}

class Car extends Vehicle{
    @Override
    public void go() {
        System.out.println("The car starts moving.");
    }
}

class Train extends Vehicle{
    @Override
    public void go() {
        System.out.println("The train starts moving.");
    }
}

class Motorcycle extends Vehicle{
    @Override
    public void go() {
        System.out.println("The motorcycle starts moving.");
    }
}

public class Main {
    public static void main(String[]args){

    Car car = new Car();
    Train train = new Train();
    Motorcycle motorcycle = new Motorcycle();

    Vehicle[] racers = {car, train, motorcycle};

    for(Vehicle v: racers){
        v.go();
    }

    //Polymorphism = greek word for poly - "many", morph - "form"
        //The ability of an object to identify as more than one type.

    //car.go(); This method is long so that we can use for loop to call easily
    //train.go();
    //motorcycle.go();
    }
}
