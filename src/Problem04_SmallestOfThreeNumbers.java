import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem04_SmallestOfThreeNumbers {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double smallestNum;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("a= ");
		a = input.nextDouble();
		System.out.print("b= ");
		b = input.nextDouble();
		System.out.print("c= ");
		c = input.nextDouble();
		
		if (a < b) {
			if (a < c) {
				smallestNum = a;
			}
			else {
				smallestNum = c;
			}
		}
		else if (b < a){ 
			if (b < c) {
				smallestNum = b;
			}
			else {
				smallestNum = c;
			}
		}
		else if (a == b) {
			if (a > c) {
				smallestNum = c;
			} 
			else {
				smallestNum = a;
			}
		}
		else { // a == b == c
			smallestNum = a;
		}
		 DecimalFormat df = new DecimalFormat("###.#");
		 // System.out.println(df.format(answer));
		System.out.printf("The smallest number is: " + df.format(smallestNum));	
	}

}
