package inherit;

public class Square extends Rectangle{
	Rectangle rekt = new Rectangle();
	public String toString(){
		Shape shp = new Shape(getColor(), isFilled());
		return "A square with side "+getWidth()+" and is a subclass of "+shp.toString();
	}
	public void setLength(double size){
		length = size;
		width = size;
	}
	public void setWidth(double size){
		length = size;
		width = size;
	}
}
