package Lesson12;

import java.util.Objects;

enum Types {Cargo, Passenger, Sport};

enum Brands {Boing, Airbus, SuperJet};

public class Task4 {
    public static void main(String[] args) {
        Airport airport = new Airport();
        Plane plane[] = {new Plane(50, Types.Sport, Brands.SuperJet),
                new Plane(100, Types.Passenger, Brands.SuperJet),
                new Plane(70, Types.Passenger, Brands.Airbus),
                new Plane(120, Types.Passenger, Brands.Airbus),
                new Plane(80, Types.Cargo, Brands.Boing),
                new Plane(90, Types.Sport, Brands.Boing),
                new Plane(40, Types.Sport, Brands.SuperJet),
                new Plane(95, Types.Cargo, Brands.Boing),
                new Plane(100, Types.Passenger, Brands.Airbus),
                new Plane(130, Types.Cargo, Brands.Boing)};

        for (Plane pl : plane) {
            airport.landPlane(pl);
        }
        Plane addPlane = new Plane(140, Types.Cargo, Brands.Boing);
        airport.landPlane(addPlane);

        Plane flyPlane = new Plane(100, Types.Passenger, Brands.Airbus);
        airport.takeOfPlane(flyPlane);

        Plane addPlane1 = new Plane(120, Types.Cargo, Brands.Airbus);
        airport.landPlane(addPlane1);

        airport.display();

    }
}

class Plane {
    int weight;
    Types type;
    Brands brand;

    public Plane(int weight, Types type, Brands brand) {
        this.weight = weight;
        this.type = type;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return weight == plane.weight &&
                type == plane.type &&
                brand == plane.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, type, brand);
    }
}

class Airport {
    Plane airport[] = new Plane[10];
    int flag = 0;

    public Airport() {
        Plane temp = new Plane(0, Types.Passenger, Brands.Boing);
        for (int i = 0; i < airport.length; i++) {
            airport[i] = temp;
        }
    }

    void landPlane(Plane plane) {
        flag = 0;
        for (int i = 0; i < airport.length; i++) {
            if (airport[i].weight == 0) {
                System.out.println("Boarding allowed");
                flag = 1;
                airport[i] = new Plane(plane.weight, plane.type, plane.brand);
                break;
            }
        }
        if (flag == 0) {
            System.out.println("There are no free places at the airport");
        }
    }

    void takeOfPlane(Plane plane) {
        flag = 0;
        for (int i = 0; i < airport.length; i++) {
            if (airport[i].equals(plane)) {
                System.out.println("Take-off is allowed");
                flag = 1;
                airport[i] = new Plane(0, Types.Passenger, Brands.Boing);
                break;
            }
        }
        if (flag == 0) {
            System.out.println("There is no such plane");

        }
    }

    void display() {
        for (Plane pl : airport) {
            if (pl != null) {
                System.out.println("Brand name: " + pl.brand.name() + " Type name: " + pl.type.name() + " Weight plane: " + pl.weight);
            }
        }
    }
}