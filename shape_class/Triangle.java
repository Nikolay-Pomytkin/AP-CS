package shape;
public class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(){
        super("Triangle", "Turquoise");
        base = 0;
        height = 0;
    }

    public double calcArea(){
        return (base*height)/2;
    }
    public String type(){
        return "Triangle";
    }

    public double getBase(){
        return base;
    }
    
    public double getHeight(){
        return height;
    }
    public double calcPerimeter(){
        return base + height * 1.87;
    }
}

