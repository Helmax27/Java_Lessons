package Lesson9;

public class Task3 {
    public static void main(String[] args) {
        Triangle t1= new Triangle(4, 3, 5);
        Triangle t2= new Triangle(10, 10, 5);
        Triangle t3= new Triangle(2, 3, 4);
        System.out.println(t1.perimeterValue());
        System.out.println(t3.areaValue());
        System.out.println(t1.typeTriangle());
        System.out.println(t2.typeTriangle());
        System.out.println(t3.typeTriangle());
    }

}
class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double perimeterValue () {
        return a+b+c;
    }
    public double areaValue () {
        return Math.sqrt(perimeterValue()/2*(perimeterValue()/2-a)*(perimeterValue()/2-b)*(perimeterValue()/2-c));
    }
    public String typeTriangle () {
        if (Math.pow(c,2)==(Math.pow(a,2)+Math.pow(b,2))){
            return ("Rectangular");
        }
        else if (Math.pow(c,2)<(Math.pow(a,2)+Math.pow(b,2))) {
            return("Actute-angled");
        }
        else if (Math.pow(c,2)>(Math.pow(a,2)+Math.pow(b,2))) {
            return ("Obtuse");
        }
        else {
            return ("Data entered incorrectly");
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }


}