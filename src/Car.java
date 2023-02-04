public class Car {
    private final String model;
    private final int price;

    //constructor
    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public void start() {
        System.out.println("The car is starting");
    }

    public void stop() {
        System.out.println("The car is stopping");
    }

    public void move() {
        System.out.println("The car is moving");
    }

}
