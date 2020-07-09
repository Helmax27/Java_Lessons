package Lesson9;

public class Task7 {
    public static void main(String[] args) {
        Figure f1=new Figure(25);
        Figure f2=new Figure(25, 16);
        Figure f3=new Figure(25, 16, 10);
        System.out.println(f1.typeFigure());
        System.out.println(f2.typeFigure());
        System.out.println(f3.typeFigure());
    }


}
class Figure {
    private int lenght;
    private int width;
    private int height;

    public Figure(int lenght, int width, int height) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public Figure(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    public Figure(int lenght) {
        this.lenght = lenght;
    }
    public String typeFigure (){
        if (height != 0 && width!=0){
            return ("Parallelepiped");
        }
        else if (width!=0) {
            return ("Triangle");
        }
        else {
            return ("Stright");
        }
    }
}
