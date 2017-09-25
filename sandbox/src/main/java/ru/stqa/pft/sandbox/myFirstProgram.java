package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
       hello();
        Square s = new Square(5);
        System.out.println("Площадь квадрата = " + s.area());

        Rectangle r = new Rectangle(5,6);
        System.out.println("Площадь прямоугольника " + r.a + " и " + r.b + "=" + r.area());

       Point w = new Point(4, 3);
      System.out.println("Расстояние между двумя точками = " + w.distance());

    }

    public static  void hello(){
        System.out.println("Hello, world ! ");
    }

//    public static double distance(Point p1, Point p2){
//      int w;
//      w = Math.sqrt(Point p1, Point p2);
//      System.out.println(w);
//    }


}