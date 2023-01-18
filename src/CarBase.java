import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarBase {

    public static List<Car> listCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(10000, "BMW", 100000, "black", "SUV", false));
        cars.add(new Car(20000, "Audi", 200000, "white", "SUV", false));
        cars.add(new Car(30000, "Mercedes", 300000, "red", "SUV", false));
        cars.add(new Car(40000, "VW", 400000, "blue", "SUV", false));
        cars.add(new Car(50000, "Opel", 500000, "yellow", "SUV", false));
        cars.add(new Car(60000, "Fiat", 600000, "green", "SUV", false));
        cars.add(new Car(70000, "Ford", 700000, "black", "SUV", false));
        cars.add(new Car(80000, "Toyota", 800000, "white", "SUV", false));
        cars.add(new Car(90000, "Honda", 900000, "red", "SUV", false));
        cars.add(new Car(100000, "Mazda", 1000000, "blue", "SUV", false));
        return cars;

    }
    public static void menu(){
        boolean buyCar = true;
        while (buyCar) {
            List<Car> cars2 = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                int random = (int) (Math.random() * CarBase.listCars().size());
                cars2.add(CarBase.listCars().get(random));
            }


            Scanner scanner = new Scanner(System.in);
            System.out.println("pokaż listę samochodów");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Wybrałeś samochód: " + cars2.get(0));
                    break;
                case 2:
                    System.out.println("Wybrałeś samochód: " + cars2.get(1));
                    break;
                case 3:
                    System.out.println("wychodze z programu");
                    buyCar = false;
                    break;
                case 4:
                    System.out.println(cars2);
                    break;
                default:
                    System.out.println("Nie ma takiego samochodu");
                    break;
            }


        }


    }








}
