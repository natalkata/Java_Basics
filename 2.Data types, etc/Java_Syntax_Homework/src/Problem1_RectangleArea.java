import java.util.Scanner;

public class Problem1_RectangleArea {

	public static void main(String[] args) {
		//Write a program that enters the sides of a rectangle (two integers a and b)
		// and calculates and prints the rectangle's area.
		
		Scanner input = new Scanner(System.in);
		System.out.println("a = ");
		int a = input.nextInt();
		
		System.out.println("b = ");
		int b = input.nextInt();
		int area = a * b;
		
		System.out.println("The area is " + area);
		
	}

}
