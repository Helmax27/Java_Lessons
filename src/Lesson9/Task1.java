package Lesson9;

public class Task1 {
    public static void main(String[] args) {
        Point p1= new Point(3,9);
        Point p2= new Point(10,29);
        System.out.println(p1.length(p2));
        System.out.println(p1.getX());
    }
}
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double length (Point p2) {
        return Math.sqrt(Math.pow(x-p2.x,2)+ Math.pow(y-p2.y,2));

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
