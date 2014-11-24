import java.util.Scanner;

public class Problem7_CountOfBitsOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int ones = 0;
		
		while (n > 0) {
			int bit = n & 1;
			if (bit == 1) {
				ones++;
			}
			n >>= 1;
		}
		System.out.println(ones);
		
	}

}
