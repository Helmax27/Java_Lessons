package Lesson9;



public class Task2 {
    public static void main(String[] args) {
        Fraction f1= new Fraction (1, 3);
        Fraction f2= new Fraction(1, 4);
        System.out.println(f1.addValue(f2));
        System.out.println(f1.subtrValue(f2));
        System.out.println(f1.multiplicationValue(f2));
        System.out.println(f1.devisionValue(f2));
    }
}
class Fraction {
    private int a;
    private int b;

    public Fraction(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public Fraction addValue(Fraction f) {
        Fraction sum= new Fraction((a*f.b)+(f.a*b),(b*f.b));
        return sum;
    }
    public Fraction subtrValue(Fraction f) {
        Fraction subtr=new Fraction((a*f.b)-(f.a*b),(b*f.b));
        return subtr;
    }
    public Fraction multiplicationValue(Fraction f1) {
        Fraction mv=new Fraction(a*f1.a,b*f1.b);
        return mv;
    }
    public Fraction devisionValue(Fraction f1) {
        Fraction dv=new Fraction(a*f1.b,b*f1.a);
        return dv;
    }

    @Override
    public String toString() {
        return a + "/" + b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
