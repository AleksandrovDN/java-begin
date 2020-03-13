public class MyFirstProgram {

    public static void main(String[] args) {

        Square s = new Square(8);

        System.out.println("Площад1 квадрата со стороной " + s.l + " = " + area(s));

        Rectangle r = new Rectangle(8, 5);
        System.out.println("Площадь фигуры со стороной " + r.a + " и " + r.b + " = " + area(r));
    }

    public static double area(Square s) { return s.l * s.l; }

    public static double area(Rectangle r) {
        return r.a * r.b;
    }
}



/*            System.out.println("Preved, " + somebody + "!");

        double y = 2.1;
        int l = 50;

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + "!!!!!!!!!");
        System.out.println("@@@@                                @@@@");
        System.out.println("    @@@@                       @@@@");
        System.out.println("        @@@@              @@@@");
        System.out.println("            @@@@@@@@@@@@@@");
        System.out.println("        @@@@              @@@@");
        System.out.println("    @@@@                      @@@@");
        System.out.println("@@@@                              @@@@" + somebody);

        System.out.println("жопа" + "IIILYAPA" + " = " + (l * l));


    }

}
*/

