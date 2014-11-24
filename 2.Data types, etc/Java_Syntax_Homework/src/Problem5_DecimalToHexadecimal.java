import java.util.Scanner;

public class Problem5_DecimalToHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		String numHex = Integer.toHexString(num);
		System.out.println(numHex);
	}

}
