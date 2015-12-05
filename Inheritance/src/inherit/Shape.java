package inherit;

public class Shape {
	public String color;
	public boolean filled;
	public Shape(){
		color = "green";
		filled = true;
	}
	public Shape(String colour, boolean c){
		color = colour;
		filled = c;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String colour){
		color = colour;
	}
	public boolean isFilled(){
		return filled;
	}
	public void setFilled(boolean c){
		filled = c;
	}
	public String toString(){
		String g="";
		if(filled=true){
			g="is filled in";
		}
		else if(filled = false){
			g = "is not filled in";
		}
		return "The color is "+getColor()+" and "+g;
	}
}
