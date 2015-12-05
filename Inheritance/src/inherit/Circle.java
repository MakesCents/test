package inherit;

public class Circle extends Shape{
	double radius;
	Shape shp = new Shape();
	public Circle(){
		radius = 1.0;
	}
	public Circle(double radii){
		radius = radii;
	}

	public Circle(double radii,boolean fill, String colour ){
		radius = radii;
		filled = fill;
		color = colour;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radii){
		radius = radii;
	}
	public double getArea(){
		double area = Math.pow(radius, 2)*Math.PI;
		return area;
	}
	public double getPerimeter(){
		double perimeter = 2*radius*Math.PI;
		return perimeter;
	}
	public String toString(){
		Shape shp = new Shape(getColor(), isFilled());
		return "A circle with radius = "+getRadius()+" and is a subclass of "+shp.isFilled();
	}
}
