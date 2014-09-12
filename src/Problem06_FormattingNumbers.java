import java.util.Scanner;



public class Problem06_FormattingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		double b;
		double c;
		String binary;
		int binA;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("a= ");
		a = input.nextInt();
		
		System.out.print("b= ");
		b = input.nextDouble();
		
		System.out.print("c= ");
		c = input.nextDouble();
		
		System.out.printf("%-10S", Integer.toHexString(a));	
		
		binary = Integer.toBinaryString(a);
		binA = Integer.parseInt(binary);
		
		System.out.printf("%010d", binA);
		System.out.printf("%10.2f", b);
		System.out.printf("%-10.3f", c);

	}
	

}
