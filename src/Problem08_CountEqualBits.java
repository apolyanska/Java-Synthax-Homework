import java.util.Scanner;

public class Problem08_CountEqualBits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 5;
		int bit;
		int nextBit;
		int count = 0;
		int pos;
		int j = 31;
	//	String str;
	//	String next;
		
		System.out.print("n= ");
		//n = input.nextInt();
		
	//	String bit1;
	//	String n1;
	//	String nextBit1;
		for ( j = 30; j >= 0; j--) {		//finds the position (j) of the first bit 1
			pos = (int)Math.pow(2, j)& n;
			System.out.println(Integer.toBinaryString(pos));

			if (pos != 0) {
				break;
			}
		}
		for (int i = 0; i < j; i++) {
			bit = n & 1;
			
	//		System.out.println(Integer.toBinaryString(n));
		//	System.out.println(Integer.toBinaryString(bit));

			
			n = n >> 1;
		
			nextBit = n & 1;
		//	System.out.println(Integer.toBinaryString(nextBit));

			if (bit == nextBit) {
				count++;
			}
			
			
		}
		System.out.printf("Equal bit pairs are: %d", count);
	}

}
