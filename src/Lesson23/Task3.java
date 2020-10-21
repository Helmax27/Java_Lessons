package Lesson23;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        //TreeSet<Knight> knights = new TreeSet<>();
        List<Knight> knights = new ArrayList<>();
        knights.add(new Knight(30, 85, 89, "Frightened"));
        knights.add(new Knight(42, 79, 90, "Woodcutter"));
        knights.add(new Knight(90, 75, 95, "Winner"));
        knights.add(new Knight(79, 95, 74, "Noble"));
       /* Comparator<Knight> comparator= new Comparator<Knight>() {
            @Override
            public int compare(Knight o1, Knight o2) {
                return (o1.getDamage()+o1.getHealth()+o1.getReservation())-(o2.getDamage()+o2.getHealth()+o2.getReservation());
            }
        };*/
        System.out.println("Before sorting \n" + knights);
        knights.sort((Knight o1, Knight o2) ->
                (o1.getDamage() + o1.getHealth() + o1.getReservation()) - (o2.getDamage() + o2.getHealth() + o2.getReservation()));

        System.out.println("After sorting \n" + knights);
    }
}

class Knight {
    private int health;
    private int reservation;
    private int damage;
    private String name;

    public Knight(int health, int reservation, int damage, String name) {
        this.health = health;
        this.reservation = reservation;
        this.damage = damage;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getReservation() {
        return reservation;
    }

    public void setReservation(int reservation) {
        this.reservation = reservation;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Knight)) return false;
        Knight knight = (Knight) o;
        return getHealth() == knight.getHealth() &&
                getReservation() == knight.getReservation() &&
                getDamage() == knight.getDamage() &&
                Objects.equals(getName(), knight.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHealth(), getReservation(), getDamage(), getName());
    }

    @Override
    public String toString() {
        return "Knight " +
                "health=" + health +
                " reservation=" + reservation +
                ", damage=" + damage +
                ", name='" + name + '\'' +
                '}' + "\n";
    }
}
