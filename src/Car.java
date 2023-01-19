public class Car {
    double value;
    String producer;
    Integer carMileage;
    String color;
    String segment;

    private boolean isDamaged;


    public Car(Integer value, String producer, Integer carMileage, String color, String segment, boolean isDamaged) {
        this.value = value;
        this.producer = producer;
        this.carMileage = carMileage;
        this.color = color;
        this.segment = segment;
        this.isDamaged = isDamaged;

    }

    public void fixGearbox() {
        isDamaged = false;
        value *= 1.5;
    }

    public boolean isDamaged() {
        return isDamaged;
    }

    @Override
    public String toString() {
        return "Car{" +
                "value=" + value +
                ", producer='" + producer + ", is it broken? " + isDamaged +"]";

    }
}
