package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        //hello(" World");
        //hello(" Usver");
        //hello(" CHPOK");

        Square s = new Square(5);

        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

        Rectangle r = new Rectangle(8, 3);

        System.out.println("Площадь фигуры со стороной " + r.a + " и " + r.b + " = " + area(r));

        Point i = new Point();

        System.out.println("Квадратный корень 7 * 9 = "  + i.t + area(i));

            }

    //public static void hello(String somebody) {
      //  System.out.println("Preved suka" + somebody + "!");

    //}


    public static double area(Square s) {
        return s.l * s.l;
    }

    public static double area(Rectangle r) {
        return r.a * r.b;
    }

    public static double area(Point i) {
        return i.as;
    }
}
