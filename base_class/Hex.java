package base;
import base.AbstractNumber;

public class Decimal extends AbstractNumber {
    public Decimal(String val) {
        value = val;
    }

    public Decimal() {
        value = "0";
    }

    public double convertToDecimal(){
        return Double.parseDouble(value);
    }
}
