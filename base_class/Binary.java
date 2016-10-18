package base;
import base.AbstractNumber;

public class Binary extends AbstractNumber {
    public Binary(String val) {
        value = val;
    }

    public Binary() {
        value = "0";
    }
    
    public double convertToDecimal() {
      double decimal = 0;
      int p = 0;
      
      int binaryNumber = Integer.parseInt(value);

      while(true) {
        if (binaryNumber == 0) {
          break;
        } else {
          double temp = binaryNumber % 10;
          decimal += temp * Math.pow(2, p);
          binaryNumber = binaryNumber / 10;
          p++;
        }
      }
        
      return decimal;
    }
}
