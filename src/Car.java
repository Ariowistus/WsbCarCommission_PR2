public class Car {
    private double value;
    private String brand;
    private int mileage;
    private String color;
    private String segment;
    private boolean brakes;
    private boolean suspension;
    private boolean engine;
    private boolean body;
    private boolean transmission;

    public Car(double value, String brand, int mileage, String color, String segment, boolean brakes, boolean suspension, boolean engine, boolean body, boolean transmission) {
        this.value = value;
        this.brand = brand;
        this.mileage = mileage;
        this.color = color;
        this.segment = segment;
        this.brakes = brakes;
        this.suspension = suspension;
        this.engine = engine;
        this.body = body;
        this.transmission = transmission;
    }
    public void repair(String element) {
        switch (element) {
            case "brakes":
                value *= 1.1;
                brakes = true;
                break;
            case "suspension":
                value *= 1.2;
                suspension = true;
                break;
            case "engine":
                value *= 2;
                engine = true;
                break;
            case "body":
                value *= 1.5;
                body = true;
                break;
            case "transmission":
                value *= 1.5;
                transmission = true;
                break;
            default:
                System.out.println("Invalid element");
                break;
        }
    }
    public double getValue() {
        return value;
    }
    public void washer() {
        System.out.println("Car is washed");
    }
}