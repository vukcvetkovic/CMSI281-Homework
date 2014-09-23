package edu.lmu.cmsi.nick.hw2;

public class Circle {
	private Point center;
	private double radius, area, circumference, diameter;
	public Circle(Point center, double radius){
		this.center = center;
		this.radius = radius;
		final double PI = Math.PI;
		double area = PI * Math.pow( radius, 2 );
		double circumference = 2 * PI * radius;
		double diameter = 2 * radius;
	}
	public double getRadius() {
		return this.radius;
	}//returning the value of radius
	public Point getCenter() {
		return this.center;
	}//returng the value of center 
	public double getDiameter() {
		return this.diameter;
	}//returng the value of diameter 
	public double getCircumference() {
		return this.circumference;
	}//returng the value of cirucmference
	public double getArea() {
		return this.area;
	}//returng the value of area of the circle 
	public boolean inCircle(Point p) {
		Point center = this.center;
		if ( center.distanceTo( p ) <= this.radius ) {
			return true;
		} else {
			return false;
		}
	}
	public Point translate(Point p) {
		Point center = this.center;
		double x = center.getX() + p.getX();
		double y = center.getY() + p.getY();
		Point newCenter = new Point( x, y );
		this.center = newCenter;
		return this.center;
	}
	public Rectangle getBoundingRectangle() {
		Point center = this.center;
		double a1 = center.getX() + diameter;
		double b1 = center.getY() + diameter;
		double a2 = a1 - this.diameter;
		double b2 = b1 - this.diameter; 
		Point topLeft = new Point(a2, b1);
		Point topRight = new Point(a1, b1);
		Point bottomRight = new Point(a1, b2);
		Point bottomLeft = new Point(a2, b2);
		double length = topLeft.distanceTo(topRight);
		double width = topLeft.distanceTo(bottomLeft);
		Rectangle r = new Rectangle(topLeft, length, width);
		return r;
	}
}