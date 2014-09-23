package CMSI281-Homework.homework1.src.main.java.edu.cmsi;

public class Line {
	private Point a, b;
	public Line(Point a, Point b){
		// creating two points
		this.a = a;
		this.b = b;
	}
	public Point getStartPoint() {
		// getting begining point
		return this.a;
	}
	public Point getEndPoint() {
		// getting ending point
		return this.b;
	}
	public Point getMidpoint(){
		// finding the midpoint
		Point p1 = this.a;
		Point p2 = this.b;
		double x = ( p1.getX() + p2.getX() ) / 2;
		double y = ( p1.getY() + p2.getY() ) / 2;
		Point midpoint = new Point(x, y);
		return midpoint;
	}
	public boolean equalTo(Line l){
		boolean check = false;
		// this checks the equality of start and end points
		if ( this.a.equalTo( l.a ) ) {
			if ( this.b.equalTo( l.b ) ) {
				check = true;
				return check;
			} else {
				return check;
			}
		// check if start is equal to end and if end is equal to start
		} else if ( this.a.equalTo( l.b ) ) {
			if ( this.b.equalTo( l.a ) ) {
				check = true;
				return check;
			} else {
				return check;
			}
		}
		return check;
	}
	public double getMinX() {
		// returning mininum of both x values
		return Math.min(this.getStartPoint().getX(), this.getEndPoint().getX() );
	}
	public double getMaxX() {
		// returning maximum of both tx values
		return Math.max(this.getStartPoint().getX(), this.getEndPoint().getX() );
	}
	public double getMinY() {
		// returning minimum of both y values
		return Math.min(this.getStartPoint().getY(), this.getEndPoint().getY() );
	}
	public double getMaxY() {
		// returning maximum of both y values
		return Math.max(this.getStartPoint().getY(), this.getEndPoint().getY() );
	}
	
	public double length(){
		// getting the length of line
		double distance = this.a.distanceTo(this.b);
		return distance;
	}
}