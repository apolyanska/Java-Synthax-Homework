import java.util.Scanner;


public class Problem07_CountOfBitsOne {

	public static void main(String[] args) {
		
		int n;
		int count;
		
		Scanner input = new Scanner(System.in);
		System.out.print("n= ");
		n = input.nextInt();
		count = Integer.bitCount(n);
		
		System.out.printf("bits 1 is n are: %d", count);
	}

}
