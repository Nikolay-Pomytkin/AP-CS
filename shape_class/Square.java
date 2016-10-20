package shape;
public class Square extends Shape {    
    private double width;
    
    public Square(){
        super("Square", "Yellow");
        width = 0;
    }
    
    public Square(String n, String c, double w){
        super(n,c);
        width = w;
    }
    
    public String type(){
        return "Square";
    }
    
    public double getWidth(){
        return width;
    }
    
    public double calcArea(){
        return width * width;
    }
    
    public double calcPerimeter(){
        return width * 4;
    }
}