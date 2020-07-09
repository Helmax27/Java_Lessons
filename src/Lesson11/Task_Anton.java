package Lesson11;

public class Task_Anton {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(10, 20);
        Double a = rectangle.getPerimeter();
        System.out.println(a);
        rectangle.calcArea();
        rectangle.calcPerimeter();
        Double perimeter = rectangle.getPerimeter();
        System.out.println(perimeter);

    }
}
abstract class Figura {
    double perimeter;
    double area;

}
interface Actions {
    void display();
    void calcPerimeter();
    void calcArea();
}
class Rectangle extends Figura implements Actions {
    double width;
    double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        calcPerimeter();
        calcArea();
    }
    @Override
    public void calcPerimeter(){
            this.perimeter =  width*2+height*2;
    }
    @Override
    public  void calcArea () {
        this.area =  width*height;
    }

    @Override
    public void display(){
        System.out.println("Rectangle Area:"+this.area+"Rectangle Perimeter: "+ this.perimeter);
    }
}