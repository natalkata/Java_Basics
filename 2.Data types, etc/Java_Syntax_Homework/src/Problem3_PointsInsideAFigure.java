import java.util.Scanner;

public class Problem3_PointsInsideAFigure {

	public static void main(String[] args) {
		// Write a program to check whether a point is inside or outside of the figure below. 
		//The point is given as a pair of floating-point numbers, separated by a space. 
		// Your program should print "Inside" or "Outside". 
		
		Scanner input = new Scanner(System.in);
		String coordinates = input.nextLine();
		String[] points = coordinates.split(" ");
		
		float x = Float.parseFloat(points[0]);
		float y = Float.parseFloat(points[1]);
		
		if ((x >= 12.5 && x <= 22.5 && y >= 6 && y <= 8.5) ||
		((x >= 12.5 && x <= 17.5) || x >= 20 && x <= 22.5) && ( y >= 8.5 && y <= 13.5)) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}

	}

}
