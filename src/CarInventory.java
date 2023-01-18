import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarInventory {

    private double cash;
    private List<Car> carList;

    public CarInventory(double cash) {
        this.cash = cash;
        this.carList = new ArrayList<>();
    }

    public void generateCars() {
        Random rand = new Random();

        // generowanie losowych pojazdów
        for (int i = 0; i < 10; i++) {
            double value = rand.nextDouble() * 100000 + 20000;
            String brand = "Brand " + (rand.nextInt(4) + 1);
            int mileage = rand.nextInt(300000) + 1000;
            String color = "Color " + (rand.nextInt(4) + 1);
            String segment = "Segment " + (rand.nextInt(3) + 1);
            boolean brakes = rand.nextBoolean();
            boolean suspension = rand.nextBoolean();
            boolean engine = rand.nextBoolean();
            boolean body = rand.nextBoolean();
            boolean transmission = rand.nextBoolean();

            carList.add(new Car(value, brand, mileage, color, segment, brakes, suspension, engine, body, transmission));
        }
    }
    public void buyCar(Car car) {
        if (carList.contains(car) && cash >= car.getValue()) {
            cash -= car.getValue();
            carList.remove(car);
            System.out.println("Car bought successfully");
        } else {
            System.out.println("Error: Car not found or not enough cash");
        }
    }
    public void sellCar(Car car) {
        if (carList.contains(car)) {
            cash += car.getValue() * 0.98; // 2% tax
            carList.remove(car);
            System.out.println("Car sold successfully");
        } else {
            System.out.println("Error: Car not found");
        }
    }
    public double getCash() {
        return cash;
    }
    public List<Car> getCarList() {
        return carList;
    }
}
