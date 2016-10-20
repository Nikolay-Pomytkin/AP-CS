package shape;

public class Rectangle extends Shape {
    private double width;
    private double length;
    
    public Rectangle(){
        super("Rectangle", "Orange");
        width = 0;
        length = 0;
    }
    
    public Rectangle(String n, String c, double l, double w){
        super(n,c);
        length = l;
        width = w;
    }
    
    public String type(){
        return "Rectangle";
    }
    
    public double calcArea(){
        return length * width;
    }
    public double calcPerimeter(){
        return length * 2 + width * 2;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getLength(){
        return length;
    }
}
