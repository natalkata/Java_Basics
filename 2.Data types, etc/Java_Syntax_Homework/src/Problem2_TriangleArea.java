import java.util.Scanner;

public class Problem2_TriangleArea {

	public static void main(String[] args) {
		// Write a program that enters 3 points in the plane (as integer x and y coordinates), calculates and 
		//prints the area of the triangle composed by these 3 points.
		// Round the result to a whole number. In case the three points do not form a triangle, print "0" as result
		
		Scanner input = new Scanner(System.in);
		
		int Ax = input.nextInt();
		int Ay = input.nextInt();
		int Bx = input.nextInt();
		int By = input.nextInt();
		int Cx = input.nextInt();
		int Cy = input.nextInt();
		
		float area = Math.abs((Ax * (By - Cy) + Bx * (Cy - Ay) + Cx * (Ay - By))/2);
		System.out.println((int)(area));
	}

}
