package CMSI281.hw2.src.main.java.edu.cmsi;

public class Point{
  private double x, y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
     if (x <= 0 || y <= 0) {
      //chech if x and y are greater then 0
       throw new IllegalArgumentException("Must be greater then zero");
     } else if ( Double.isNaN( x ) ) {
      //check if there is no imput
       throw new IllegalArgumentException(" Must have input");
     }
  }
   public Point( Point p ){
    //check if there is no input
       if (Double.isNaN( x ) || Double.isNaN( y ) ) {
         throw new IllegalArgumentException(" Must have input");
       }
     this.x = p.x;
     this.y = p.y;
   }
  public boolean equalTo(Point p){
    //checking for equality
    if ( this.distanceTo(p) == 0 ) {
      return true;
    } else {
      return false;
    }
  }

  public boolean equals(Point p){
    //checking for equality
    if ( this.distanceTo(p) == 0 ) {
      return true;
    } else {
      return false;
    }
  }

  public String toString() {
    return "(" + this.x + ", " + this.y + ")";
  }

  public double distanceTo(Point p) {
    //calculationg distance
    double d = Math.sqrt( Math.pow( ( this.x - p.x ), 2) + Math.pow( ( this.y - p.y ), 2) );
    return d;
  }

  public double getX(){
    return this.x;
    //return x cordinate
  }

  public double getY(){
    return this.y;
    //return y cordinate
  }

  public Point translate(Point p) {
    this.x += p.getX();
    this.y += p.getY();
    //moving the point
    return this;
  }

  public boolean isStraight(Point p) {
    if ( this.x == p.getX() || this.y == p.getY() ) {
      return true;
    } else {
        return false;
      }
  }
