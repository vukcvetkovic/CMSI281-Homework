package CMSI281-Homework.homework1.src.main.java.edu.cmsi;

public class Rectangle {
	private double sidea, sideb, area;
	private Point topLeft, bottomLeft, topRight, bottomRight;
	public Rectangle(Point topLeft, Point bottomLeft, Point topRight, Point bottomRight) {
		this.topLeft = topLeft;
		this.topRight = topRight;
		this.bottomLeft = bottomLeft;
		this.bottomRight = bottomRight;
		sidea = topLeft.distanceTo(bottomLeft);
		sideb = topLeft.distanceTo(topRight);
	}
	public Rectangle(Point topLeft, double length, double width) {
		this.topLeft = topLeft;
		double x1, y1;
		x1 = this.topLeft.getX() + width;
		y1 = this.topLeft.getY() + length;
		this.bottomRight = new Point(x1,y1);
		sidea = length;
		sideb = width;
		this.area = sidea * sideb;
	}
	public double getArea() {
		// returning the value of the area
		return this.area;
	}
	public Point getCenter() {
		Line midpoint = new Line(this.topLeft, this.bottomRight);
		Point center =  midpoint.getMidpoint() ;
		return center;
	}
	public Point getTopLeftCorner() {
		// return the point at the top left corner
	}
	public boolean inRectangle(Point p) {
		Point center = this.getCenter();
		if ( center.distanceTo(p) > sidea && center.distanceTo(p) > sideb ) {
				return false;
			} else {
				return true;
			}	
	}
	public void translate(Point p) {
		this.topLeft.translate(p);
		this.topRight.translate(p);
		this.bottomRight.translate(p);
		this.bottomLeft.translate(p);
	}
	public Rectangle getBoundingRectangle() {
		// return the same rectangle
		return this;
	}
	public double getPerimeter() {
		double perimeter = 2 * sidea + 2 * sideb;
		return perimeter;
	}
	public boolean equalTo(Rectangle r) {
		if (this.topLeft == r.topLeft && 
			this.sidea == r.sidea &&
			this.sideb == r.sideb ) {
			return true;
		} else {
			return false; 
		}
	}	
}