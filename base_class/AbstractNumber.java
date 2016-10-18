package base;

public abstract class AbstractNumber {
    public String value;

    public AbstractNumber(String val) {
        value = val;
    }

    public AbstractNumber() {
        value = "";
    }
    
    public String convertToBinary() {
        double oldVal = this.convertToDecimal();
        int oldValInt = (int) oldVal;
        return Integer.toBinaryString(oldValInt);
    }
    
    public abstract double convertToDecimal();
    
    public String convertToHex() {
        double oldVal = this.convertToDecimal();
        return Double.toHexString(oldVal);
    }
}
