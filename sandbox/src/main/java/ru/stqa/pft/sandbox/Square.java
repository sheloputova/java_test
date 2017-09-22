package ru.stqa.pft.sandbox;

/**
 * Created by SHEEG on 22.09.2017.
 */
public class Square {
  public double l;

  public Square(double l){
    this.l = l;
  }

  public double area() { //метод
    return this.l * this.l;
  }
}
