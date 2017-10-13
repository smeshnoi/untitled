package Work10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Garage {
    public static void main(String[] args) {
        HashMap<Car, Integer> garageCar = new HashMap<>();
        Car car = new TypeEngine("BMW", "318", 1998, "Black", "Sedan", "i");
        Car car1 = new TypeEngine("BMW", "318", 1998, "Black", "Sedan", "i");
        Car car2 = new Car("Mercedes", "C180", 2001, "White");
        Car car3 = new Car("Honda", "Accord", 2008, "Gray");
        Car car4 = new TypeCarModelTruck("Volvo", "truck", 2008, "Blue", "Dumper");
        Car car5 = new TypeCarModelTruck("Volvo", "truck", 2008, "Blue", "Dumper");
        Car car6 = new TypeCarModelTruck("MAZ", "truck", 1995, "Blue", "Waggon");
        System.out.println(car.equals(car1));
        System.out.println(car.equals(car1));
        int count = 1;
        garageCar.put(car,count);
        garageCar.put(car2,count);
        garageCar.put(car3,count);
        garageCar.put(car4,count);
        for (Car value: garageCar.keySet()) {
            System.out.println(value);
            if (value.equals(car1)) {
                garageCar.put(car1,count + 1);
            }
            if (value.equals(car5)) {
                garageCar.put(car5,count + 1);
            }
        }
        System.out.println(garageCar.get(car));
        List<Car> carList = new ArrayList<>();
        carList.add(car);
        carList.add(car1);
        for (Car value: garageCar.keySet()) {
            System.out.println(value.getMark() + " - " + garageCar.get(value));
        }
    }

    public static HashMap inParking (Car car, HashMap<Car, Integer> garageCar) {
        for (Car value: garageCar.keySet()) {
            if (value.equals(car)) {
                garageCar.put(car, garageCar.get(value) + 1);
            } else {
                garageCar.put(car, 1);
            }
        }
        return garageCar;
    }

    public static HashMap outParking (Car car, HashMap<Car, Integer> garageCar) {
        for (Car value: garageCar.keySet()) {
            if (value.equals(car)) {
                garageCar.put(car, garageCar.get(value) - 1);
            } else {
                System.out.println("Car not found");
            }
        }
        return garageCar;
    }
}
