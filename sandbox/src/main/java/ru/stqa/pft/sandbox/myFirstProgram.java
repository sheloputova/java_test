package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
       hello();
        double l = 5;
        System.out.println("Площадь квадрата = " + area(l));

        double a = 5;
        double b = 6;
        System.out.println("Площадь прямоугольника " + a + " и " + b + "=" + area(a,b));
    }

    public static  void hello(){
        System.out.println("Hello, world ! ");
    }

    public static double area(double l) {
        return l * l;
    }

    public static double area(double a, double b){
        return a * b;
    }
}