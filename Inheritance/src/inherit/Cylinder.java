package inherit;

public class Cylinder extends Circle{
	double height;
	public Cylinder(){
		radius = 1.0;
		height = 1.0;
	}
	public Cylinder(double radii, double high){
		height = high;
		radius = radii;
	}
	public Cylinder(double radii, double high, boolean fill, String colour){
		radius = radii;
		height = high;
		filled = fill;
		color = colour;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double high){
		height = high;
	}
	public String toString(){
		Shape circ = new Shape(getColor(), isFilled());
		return "A Cylinder with a radius of "+getRadius()+" and height "+ getHeight()+"and is a subclass of "+ circ.toString();
	}
}
