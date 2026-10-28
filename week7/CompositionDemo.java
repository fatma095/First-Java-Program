class Engine {

    public void start() {
        System.out.println("Engine started.");
    }
}

class Car {

    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public void startCar() {
        System.out.println("Car is starting...");
        engine.start();
    }
}

public class CompositionDemo {

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.startCar();
    }
}