import java.util.Scanner;


public class Problem05_DecimalToHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int i = input.nextInt();
		String hex = Integer.toHexString(i);
		System.out.printf("Hex value is: %S",hex);
	}

}
