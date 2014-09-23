package CMSI281-Homework.homework1.src.main.java.edu.cmsi;

public class Square {
	private Point cornera, cornerb, cornerc, cornerd;
	private double sidea, sideb, sidec, sided, area, perimeter;
	public Square(Point p1, Point p2, Point p3, Point p4) {
		this.cornera = p1;
		this.cornerb = p2;
		this.cornerc = p3;
		this.cornerd = p4;
		sidea = cornera.distanceTo(cornerb);
		sideb = cornerb.distanceTo(cornerc);
		sidec = cornerc.distanceTo(cornerd);
		sided = cornerd.distanceTo(cornera);
		//doing calculation for area,periimeter
		area = sidea * sideb;
		perimeter = 4 * sidea;

		//chech that all sides are same
		if (!isSquare(this) ) {
			throw new IllegalArgumentException("All sides must be equal to each other");
		}
	}
	public boolean isSquare(Square s) {
		//checking if all the sides are the same
		if (this.sidea != this.sideb || this.sideb != this.sidec ||
			this.sidec != this.sided || this.sideb != this.sided ||
			this.sidea != this.sided || this.sidec != this.sidea) {
			return false;
		} else {
			return true;
		}
	}
	public double getArea() {
		return this.area;
	}// return area
	public Point getCenter() {
		Line midpoint = new Line(this.cornera, this.cornerd);
		Point center =  midpoint.getMidpoint() ;
		return center;
	}
	public boolean inSquare(Point p) {
		Point center = this.getCenter();
		//checking for the placement of the point within the square
		if ( center.distanceTo(p) > sidea && center.distanceTo(p) > sideb ) {
				return false;
			} else {
				return true;
			}	
	}
	public double getPerimeter() {
		// returni perimiter
		return this.perimeter;
	}
	public Square translate(Point p) {
		cornera.translate(p);
		cornerb.translate(p);
		cornerc.translate(p);
		cornerd.translate(p);
		Square s = new Square(cornera, cornerb, cornerc, cornerd);
		return s;
	}
	public Rectangle getBoundingRectangle() {
		Rectangle r = new Rectangle(this.cornera, this.sidea, this.sideb);
		return r;
	}
	public boolean equalTo(Square s) {
		//chequing the equality of two squares
		if (this.cornera == s.cornera && this.cornerb == s.cornerb &&
			this.cornerc == s.cornerc && this.cornerd == s.cornerd) {
			return true;
		} else {
			return false;
		}
	}
}