import java.util.Scanner;

public class bigEZ_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double random = 0;
		double sum = 0;
		double average;
		double total = 0;
		double counter = 0;
		int numCounter = 0;
		int iterations;
		
		System.out.println("Enter your iterations:");
		iterations = sc.nextInt();
		for(int i = 0; i < iterations; i++){
			while(sum < 1){
				random = Math.random();
				sum += random;
				numCounter++;
			}
			total += numCounter; 
			counter++;
			sum = 0;
			numCounter = 0;
		}
		average = total / counter;
		System.out.println("The average is: " + average);		
	}
	
}
