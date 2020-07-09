package Lesson8;

import java.util.Arrays;
import java.util.Objects;

public class Task6 {
    public static void main(String[] args) {
        Cars setCars[] = {new Cars("Suzuki", "Red", "123-45-789"),
                new Cars("Ford", "Black", "789-46-321"),
                new Cars("Nissan", "White", "456-97-852"),
                new Cars("Toyota", "Gray", "159-46-753"),
                new Cars("Hyundai", "Yellow", "854-96-746"),
                new Cars("Volvo", "Green", "357-95-951"),
                new Cars("Kia", "Brown", "864-73-638"),
                new Cars("Mini", "Orange", "465-13-798"),
                new Cars("Jeep", "Black", "285-98-321"),
                new Cars("BMW", "Gray", "325-75-357"),
                new Cars("Mercedes", "Red", "963-58-741")};

        Parking cars = new Parking();
        for (Cars sc : setCars) {
            cars.entryCar(sc);
        }
        System.out.println(cars.toString());

        Cars delCar = new Cars("Mercedes", "Red", "963-58-741");
        cars.exitCar(delCar);

        System.out.println(cars.toString());
        cars.searchCar("357-95-951");
    }
}

class Cars {
    String mark;
    String color;
    String number;

    public Cars(String mark, String color, String number) {
        this.mark = mark;
        this.color = color;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cars)) return false;
        Cars cars = (Cars) o;
        return mark.equals(cars.mark) &&
                color.equals(cars.color) &&
                number.equals(cars.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, color, number);
    }

    @Override
    public String toString() {
        String sc = "mark: " + mark + " color: " + color + " number: " + number;
        return sc;
    }
}

class Parking {
    Cars parking[] = new Cars[0];

    void entryCar(Cars addCar) {
        Cars newParking[] = new Cars[parking.length + 1];
        for (int i = 0; i < parking.length; i++) {
            newParking[i] = parking[i];
        }
        newParking[newParking.length - 1] = addCar;
        this.parking = newParking;
    }

    void exitCar(Cars delCar) {
        Cars temp = null;
        for (int i = 0; i < parking.length; i++) {
            if (parking[i].equals(delCar)) {
                temp = parking[i];
                parking[i] = parking[parking.length - 1];
                parking[parking.length - 1] = temp;
                Cars newParking[] = new Cars[parking.length - 1];
                for (int j = 0; j < parking.length - 1; j++) {
                    newParking[j] = parking[j];
                }
                this.parking = newParking;
                break;
            }
        }
        if (temp == null) System.out.println("Неверные данные, такой машины нет на стоянке");
    }

    void searchCar(String searchNumber) {
        for (Cars sc : parking) {
            if (sc.number.equals(searchNumber)) {
                System.out.println("Машина на парковке есть: " + sc.toString());
            }
        }
    }

    @Override
    public String toString() {
        String Park="Парковка:\n";
        for (Cars sc: parking) {
            Park+=sc.toString()+"\n";
        }
        return Park;
    }
}
