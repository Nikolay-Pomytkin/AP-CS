public class sortAll{
  public static Comparable [] bubbleSort (Comparable x []){
    for(int i = 0; i < x.length(); i++){
      for(int f = 0; f< x.length(); f++){
        if(x[f].compareTo(x[f+1])){
          Comparable temp = x[f]; 
          x[f] = x[f+1];
          x[f+1] = temp;
        }
      }
    }
  }
}
