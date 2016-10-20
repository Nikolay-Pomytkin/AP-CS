package shape;

public class runner {

    public static void main(String[] args) {
        Shape n = new Circle("Cool circle", "Green", 9);
        System.out.println(n.toString());
        Rectangle c = new Rectangle("Cool Rectangle", "Purple", 4, 7);
        System.out.println(c.getColor());
    }
    
}
