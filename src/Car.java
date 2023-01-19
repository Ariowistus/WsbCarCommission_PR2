public class Car {
    double value;
    String producer;
    Integer carMileage;
    String color;
    String segment;

    private boolean gearbox;

    public Car(Integer value, String producer, Integer carMileage, String color, String segment, boolean gearbox) {
        this.value = value;
        this.producer = producer;
        this.carMileage = carMileage;
        this.color = color;
        this.segment = segment;
        this.gearbox = gearbox;
    }

    public void fixGearbox() {
        gearbox = true;
        value *= 1.5;
    }

    @Override
    public String toString() {
        return "[value=" + value +", producer='" + producer+"]";
    }
}
