package shape;

public abstract class Shape {
  private String name;
  private String color;
  
  public Shape(){
    name = "Shape";
    color = "White";
  }
  
  public Shape(String n, String c){
    name = n;
    color = c;
  }
  	
    public abstract double calcArea();
    public abstract String type();
    public abstract double calcPerimeter();

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public void setName(String n){
        name = n;
    }

    public void setColor(String c){
        color = c;
    }

    public String toString(){
            return "Name: " + getName() + ", Type: " + type() + ", Color: " + getColor() + ", Area: " + calcArea() + ", Perimeter: "+ calcPerimeter();
    }

}