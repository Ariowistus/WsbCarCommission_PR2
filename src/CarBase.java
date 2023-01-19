import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CarBase {

    public static List<Car> listCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(10000, "BMW", 100000, "black", "SUV", false, false, false, false, false));
        cars.add(new Car(20000, "Audi", 200000, "white", "premium", false, false, false, false, false));
        cars.add(new Car(30000, "Mercedes", 300000, "red", "sedan", false, false, false, false, false));
        cars.add(new Car(40000, "Fiat", 400000, "blue", "hatchback", false, false, false, false, false));
        cars.add(new Car(50000, "Opel", 500000, "yellow", "SUV", false, false, false, false, false));
        cars.add(new Car(60000, "Ford", 600000, "green", "premium", false, false, false, false, false));
        cars.add(new Car(70000, "Toyota", 700000, "black", "sedan", false, false, false, false, false));
        cars.add(new Car(80000, "Honda", 800000, "white", "hatchback", false, false, false, false, false));
        cars.add(new Car(90000, "Mazda", 900000, "red", "SUV", false, false, false, false, false));
        cars.add(new Car(100000, "Kia", 1000000, "blue", "premium", false, false, false, false, false));
        cars.add(new Car(110000, "Hyundai", 1100000, "yellow", "sedan", false, false, false, false, false));
        cars.add(new Car(120000, "Suzuki", 1200000, "green", "hatchback", false, false, false, false, false));

        Collections.shuffle(cars);
        return cars.subList(0, 4);

    }

//    public static List<Car> carsChange() {
//        List<Car> cars2 = new ArrayList<>();
//        for (int i = 0; i < 4; i++) {
//            int random = (int) (Math.random() * CarBase.listCars().size());
//            cars2.add(CarBase.listCars().get(random));
//
//        }
//        return cars2;
//    }
public static List<Car> carsChange() {
    listCars();
    Collections.shuffle(listCars());
    return listCars().subList(0, 4);
}


    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        List<Car> availableCars = carsChange();
        while (!exit) {
            System.out.println("Witaj w bazie samochodów");
            System.out.println("Wybierz jedną z opcji:");
            System.out.println("1. Wyświetl wszystkie samochody");
            System.out.println("2. Wybierz samochód");
            System.out.println("3. Zakończ program");
            System.out.println("4. Wylosuj nową listę samochodów");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println(availableCars);
                    break;
                case 2:
                    System.out.println("Wybierz numer samochodu:");
                    int choice = scanner.nextInt();
                    System.out.println("Wybrano samochód: " + availableCars.get(choice-1));
                    Car selectedCar = availableCars.get(choice-1);
                    System.out.println("Czy chcesz naprawić skrzynię biegów? (tak/nie)");
                    String fixGearbox = scanner.next();
                    if (fixGearbox.equalsIgnoreCase("tak")) {
                        selectedCar.fixGearbox();
                        System.out.println("Naprawiono skrzynię biegów i wartość samochodu zwiększyła się o 50%: " + selectedCar);
                    } else {
                        System.out.println("Skrzynia biegów nie została naprawiona. Wartość samochodu pozostaje bez zmian: " + selectedCar);
                    }
                    availableCars.remove(choice-1);
                    break;
                case 3:
                    exit = true;
                    System.out.println("Program zakończony");
                    break;
                case 4:
                    availableCars = carsChange();
                    System.out.println("Nowa lista samochodów:");
                    System.out.println(availableCars);
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
                    break;
            }
        }
    }
}
