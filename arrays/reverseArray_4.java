import java.util.Scanner;

public class reverseArray_4 {

	public static void main(String[] args) {
		System.out.println("Enter a set of numbers (with spaces between each number) and then press enter.");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String output = " ";
		String[] strIntegers = input.split(" ");
		int[] integers= new int[strIntegers.length];
		for(int i = 0; i < strIntegers.length; i++){
			integers[i] = Integer.parseInt(strIntegers[i]);	
		}
		System.out.println("You entered: " + input);
		for(int i = integers.length-1; i>-1; i--){
			output += integers[i];
			output += " ";
		}
		System.out.println("The reverse of that is: " + output);
	}

}
