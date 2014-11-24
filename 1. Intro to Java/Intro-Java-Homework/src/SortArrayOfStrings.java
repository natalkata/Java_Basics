import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		String[] myArray = new String[n];
		
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = in.nextLine();
		}
		Arrays.sort(myArray);
		
		for (int i = 0; i < myArray.length; i++){
			System.out.println(myArray[i]);
		}
	}

}
