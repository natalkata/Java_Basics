import java.util.Scanner;
import java.util.Arrays;

public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		int[] numbers = new int[n];
		
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = input.nextInt();
		}
		Arrays.sort(numbers);
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i] + " ");
		}
		
	}

}
