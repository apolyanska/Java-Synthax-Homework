import java.util.Scanner;

public class Problem01_RectangleArea {

	public static void main(String[] args) {
		
		int a;
		int b;
		int area;
		Scanner input = new Scanner(System.in);
		System.out.print("a= ");
		a = input.nextInt(); 
		System.out.print("b= ");
		b = input.nextInt(); 
		area = a * b;
		System.out.printf("%d", area);
	}

}
