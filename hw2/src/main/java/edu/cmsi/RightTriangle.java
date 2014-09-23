package CMSI281-Homework.homework1.src.main.java.edu.cmsi;

public class RightTriangle{
	private Point corner1, cornerb, cornerc;
	private double sidea = corner1.distanceTo(cornerb);
	private double sideb = cornerb.distanceTo(cornerc);
	private double side3 = cornerc.distanceTo(corner1);
	public RightTriangle(double sidea, double sideb, double side3) {
		this.sidea = sidea;
		this.sideb = sideb;
		this.side3 = side3;
		if (!is_right(this)) {
			//checking if it is right triangle
			throw new IllegalArgumentException("It has to beright triangle");
		}
	}
	public RightTriangle(Point p1, Point p2, Point p3) {
		this.corner1 = p1;
		this.cornerb = p2;
		this.cornerc = p3;
	}
	public boolean is_right(RightTriangle rt) {
		//checking if it indeed is right triangle
      if (corner1.getY() == cornerb.getY() || corner1.getY() == cornerc.getY() || 
      	cornerb.getY() == cornerc.getY() || corner1.getX() == cornerb.getX() ||
      	corner1.getX() == cornerc.getX() || cornerb.getX() == cornerc.getX() ) {
      	return true;
      } else {
      	return false;
      }   
 	}
}