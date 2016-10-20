package shape;

public class Circle extends Shape {
    private double radius;
    public Circle(String n, String c, double r){
        super(n,c);
        radius = r;
    }
    public Circle(){
        super("Circle", "Black");
        radius = 0;
    }
    
    public String type(){
        return "Circle";
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double calcArea(){
        return Math.PI * radius * radius;
    }
    
    public double calcPerimeter(){
        return 2 * Math.PI * radius;
    }
}
