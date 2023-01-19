public class Car {
    double value;
    String producer;
    Integer carMileage;
    String color;
    String segment;

    private boolean gearbox;
    private boolean engine;
    private boolean body;
    private boolean tires;
    private boolean chassis;

    public Car(Integer value, String producer, Integer carMileage, String color, String segment, boolean gearbox, boolean engine, boolean body, boolean tires, boolean chassis) {
        this.value = value;
        this.producer = producer;
        this.carMileage = carMileage;
        this.color = color;
        this.segment = segment;
        this.gearbox = gearbox;
        this.engine = engine;
        this.body = body;
        this.tires = tires;
        this.chassis = chassis;
    }

    public void fixGearbox() {
        gearbox = true;
        value *= 1.5;
    }
    public void fixEngine() {
        engine = true;
        value *= 2.0;
    }
    public void fixBody() {
        body = true;
        value *= 1.5;
    }
    public void fixTires() {
        tires = true;
        value *= 1.2;
    }
    public void fixChassis() {
        chassis = true;
        value *= 1.3;
    }

    @Override
    public String toString() {
        return "[value=" + value +", producer='" + producer+"]";
    }
}
