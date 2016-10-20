package transportation;
public abstract class Transportation implements Comparable<Transportation>{
    private String source;
    private String destination;
    private double distance;
    private double cost;
    
    public Transportation(){
        source = "Millburn";
        destination = "New York City";
        distance = 80;
        cost = 100.00;
    }
    
    public Transportation(String src, String dest, double dist, double cst){
        source = src;
        destination = dest;
        distance = dist;
        cost = cst;
    }
    
    public int compareTo(Transportation t){
        if(cost > t.getCost())
            return -1;
        else if(cost == t.getCost())
            return 0;
        else if(cost < t.getCost())
            return 1;
        
        return 1; 
    }

    public String getSource(){
        return source;
    }
    
    public String getDestination(){
        return destination;
    }
    
    public double getDistance(){
        return distance;
    }
    
    public double getCost(){
        return cost;
    }
}
