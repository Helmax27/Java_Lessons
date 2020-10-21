package Lesson19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

enum Types {Rectangle, Triangle, Rhombus, Circle, Line};

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();
        HashMap map = new HashMap();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int pos = random.nextInt(Types.values().length);
            Types figureName = Types.values()[pos];
            if (figureName.name().equals("Rectangle")) {
                figures.add(new Rectangle(10, 5));
            } else if (figureName.name().equals("Triangle")) {
                figures.add(new Triangle(10));
            } else if (figureName.name().equals("Rhombus")) {
                figures.add(new Rhombus(11));
            } else if (figureName.name().equals("Circle")) {
                figures.add(new Circle(20));
            } else if (figureName.name().equals("Line")) {
                figures.add(new Line(15));
            } else {
                System.out.println("Other figure");
            }
        }
        for (Figure fg: figures) {
            System.out.println(fg);
            fg.drow();
        }
    }
}

abstract class Figure {
    public Figure() {
    }

    public abstract void drow();
}

class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void drow() {
        System.out.println("Rectangle");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}


class Triangle extends Figure {
    private int width;

    public Triangle(int width) {
        this.width = width;
    }

    public void drow() {
        System.out.println("Triangle");
        for (int i = 0; i <= width; i++) {
            for (int j = width; j > i; j--) {
                System.out.print(" ");
            }
            for (int j1 = 0; j1 <= i; j1++) {
                System.out.print("x");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("x");
            }
            for (int j = width; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                '}';
    }
}

class Rhombus extends Figure {
    private int width;

    public Rhombus(int width) {
        this.width = width;
    }

    public void drow() {
        System.out.println("Rhombus");

        for (int i = 1; i < width/2; ++i){

            for (int j = width/2; j > i; --j)
                System.out.print(" ");

            for (int j = 1; j < 2 * i; ++j)
                System.out.print("*");

            System.out.println();
        }
        for (int i = width/2; i >= 1; --i){

            for (int j = width/2; j > i; --j)
                System.out.print(" ");

            for (int j = 1; j < i*2; ++j)
                System.out.print("*");

            System.out.println();
        }

    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "width=" + width +
                '}';
    }
}

class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void drow() {
        System.out.println("Circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

class Line extends Figure {
    private int length;

    public Line(int length) {
        this.length = length;
    }

    public void drow() {
        System.out.println("Line");
        for (int i = 0; i < length; i++) {
            System.out.print("x");
            System.out.println();
        }

    }

    @Override
    public String toString() {
        return "Line{" +
                "length=" + length +
                '}';
    }
}

