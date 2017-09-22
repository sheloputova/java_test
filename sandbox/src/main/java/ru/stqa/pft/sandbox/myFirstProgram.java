package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
       hello();
        Square s = new Square(5);
        System.out.println("Площадь квадрата = " + s.area());

        Rectangle r = new Rectangle(5,6);
        System.out.println("Площадь прямоугольника " + r.a + " и " + r.b + "=" + r.area());
    }

    public static  void hello(){
        System.out.println("Hello, world ! ");
    }


}