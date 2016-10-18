package base;

import base.AbstractNumber;
import base.Hex;
import base.Binary;
import base.Decimal;
import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class Base {
    public static void main(String[] args) {
        boolean running = true;
        Scanner scan = new Scanner(System.in);
        while(running) {
            System.out.println("What operation would you like to execute? (Add, Subtract, Divide, Multiply, Convert, STOP)");
            String read = scan.nextLine();
            if (!read.equals("Convert") && !read.equals("STOP")) {
                String operation = read.toLowerCase();
                System.out.println("What is the type of the first number you would like to " + operation + "? (Binary, Hex, Decimal)");
                String num1Type = scan.nextLine();
                System.out.println("What is the first number?");
                String num1Val = scan.nextLine();
                System.out.println("What is the type of the second number you would like to " + operation + "? (Binary, Hex, Decimal)");
                String num2Type = scan.nextLine();
                System.out.println("What is the second number?");
                String num2Val = scan.nextLine();
            
                // setup types for type1 and type2
                AbstractNumber num1;
                AbstractNumber num2;
    
                if (num1Type.equals("Binary")) {
                    num1 = new Binary(num1Val);
                } else if (num1Type.equals("Decimal")) {
                    num1 = new Decimal(num1Val);
                } else if (num1Type.equals("Hex")) {
                    num1 = new Hex(num1Val);
                } else {
                    throw new IllegalArgumentException("Invalid number type: " + num1Type);
                }
                
                if (num2Type.equals("Binary")) {
                    num2 = new Binary(num2Val);
                } else if (num2Type.equals("Decimal")) {
                    num2 = new Decimal(num2Val);
                } else if (num2Type.equals("Hex")) {
                    num2 = new Hex(num2Val);
                } else {
                    throw new IllegalArgumentException("Invalid number type: " + num2Type);
                }
                
                if (operation.equals("add")) {
                    System.out.println("The sum of your two numbers is: " + addNumbers(num1, num2));
                } else if (operation.equals("subtract")) {
                    System.out.println("The difference of your two numbers is: " + subtractNumbers(num1, num2));
                } else if (operation.equals("divide")) {
                    System.out.println("The quotient of your two numbers is: " + divideNumbers(num1, num2));
                } else if (operation.equals("multiply")) {
                    System.out.println("The product of your two numbers is: " + multiplyNumbers(num1, num2));
                }
                
                System.out.println("======");
            }

            if (read.equals("Convert")){
                System.out.println("What type of number are you entering? (Hex, Decimal, Binary)");
                String convertInType = scan.nextLine();
                System.out.println("What is the number you would like to convert?");
                String convertInVal = scan.nextLine();
                System.out.println("What type of number would you like to be returned? (Hex, Decimal, Binary)");
                String convertOutType = scan.nextLine();

                AbstractNumber convertInNum;

                if (convertInType.equals("Binary")) {
                    convertInNum = new Binary(convertInVal);
                } else if (convertInType.equals("Decimal")) {
                    convertInNum = new Decimal(convertInVal);
                } else if (convertInType.equals("Hex")) {
                    convertInNum = new Hex(convertInVal);
                } else {
                    throw new IllegalArgumentException("Invalid number type: " + convertInType);
                }

                String convertOutVal;
                if (convertOutType.equals("Binary")) {
                    convertOutVal = convertInNum.convertToBinary();
                } else if (convertOutType.equals("Decimal")) {
                    convertOutVal = Double.toString(convertInNum.convertToDecimal());
                } else if (convertOutType.equals("Hex")) {
                    convertOutVal = convertInNum.convertToHex();
                } else {
                    throw new IllegalArgumentException("Invalid number type: " + convertOutType);
                }

                System.out.println("The converted value is: " + convertOutVal);
            } else if (read.equals("STOP")) {
                System.out.println("Bye!");
                running = false;
            }
        }
    }
    private static double addNumbers(AbstractNumber a, AbstractNumber b) {
        double aVal = a.convertToDecimal();
        double bVal = b.convertToDecimal();
        return (aVal + bVal);
    }

    public static double subtractNumbers(AbstractNumber a, AbstractNumber b){
        double aVal = a.convertToDecimal();
        double bVal = b.convertToDecimal();
        return (aVal - bVal);
    }
    
    public static double multiplyNumbers(AbstractNumber a, AbstractNumber b){
        double aVal = a.convertToDecimal();
        double bVal = b.convertToDecimal();
        return (aVal * bVal);
    }
    
    public static double divideNumbers(AbstractNumber a, AbstractNumber b){
        double aVal = a.convertToDecimal();
        double bVal = b.convertToDecimal();
        return (aVal / bVal);
    }
}
