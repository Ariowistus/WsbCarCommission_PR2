public class Car {
    Integer value;
    String producer;
    Integer carMileage;
    String color;
    String segment;

    boolean isDamaged;

    public Car(Integer value, String producer, Integer carMileage, String color, String segment, boolean isDamaged) {
        this.value = value;
        this.producer = producer;
        this.carMileage = carMileage;
        this.color = color;
        this.segment = segment;
        this.isDamaged = isDamaged;
    }

    @Override
    public String toString() {
        return "[value=" + value +", producer='" + producer+"]";
    }
}
