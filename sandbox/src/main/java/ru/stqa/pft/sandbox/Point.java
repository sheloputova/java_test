package ru.stqa.pft.sandbox;

/**
 * Created by sheeg on 25.09.2017.
 */
public class Point {
  public double p1;
  public double p2;


public Point(double p1, double p2) {
  this.p1 = p1;
  this.p2 = p2;
}


 public double distance() {
   return Math.sqrt((this.p1 * this.p1) + (this.p2 * this.p2));

 }
}



