package inherit;

public class Rectangle extends Shape{
	public double width;
	public double length;
	public Rectangle(){
		width = 1.0;
		length = 1.0;
	}
	Shape shp = new Shape();
	public Rectangle(double wide, double leng){
		width = wide;
		length = leng;
	}
	public Rectangle(double wide, double leng, String colour, boolean fill){
		width = wide;
		length = leng;
		filled = fill;
		color = colour;
	}
	public double getWidth(){
		return width;
	}
	public void setWidth(double wide){
		width = wide;
	}
	public double getLength(){
		return length;
	}
	public void setLength(double leng){
		length = leng;
	}
	public double getArea(){
		return length*width;
	}
	public double getPerimeter(){
		return 2*length+2*width;
	}
	public String toString(){
		Shape shp = new Shape(getColor(), isFilled());
		return "A rectangle with width "+getWidth()+"and length " +getLength()+" and is a subclass of "+shp.isFilled();
	}
}
