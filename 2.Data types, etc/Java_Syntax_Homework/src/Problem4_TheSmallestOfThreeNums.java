import java.util.Scanner;

public class Problem4_TheSmallestOfThreeNums {

	public static void main(String[] args) {
		// Write a program that finds the smallest of three numbers
		
		Scanner input = new Scanner(System.in);
		
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		float smallest;
		if(a < b){
			smallest = a;
		}else if(c < b){
			smallest = c;
		} else {
			smallest = b;
		}
		System.out.println(smallest);
	}
}
