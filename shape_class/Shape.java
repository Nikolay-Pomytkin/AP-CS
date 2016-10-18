package shape;

public class Shape {
  private String name;
  private String color;
  
  public Shape(n, c){
    name = n;
    color = c;
  }
  
  public Shape(){
		name = "Shape";
		color = "White";
	}
	
	public abstract double calcArea;
	public abstract String type;
  
	public String getName(){
		return name;
	}

	public String getColor(){
		return color;
	}
	
	public String toString(){
		return "Name: " + name + ", Type: " + type() + ", Color: " + getColor() + ", Area: " + calcArea();
	}
}
