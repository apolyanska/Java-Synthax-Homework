import java.util.Scanner;


public class Problem03_PointsInsideAFigure {

	public static void main(String[] args) {
		double x;
		double y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter coordinates: ");
		x = input.nextDouble();
		y = input.nextDouble();
		
		if ( ( (x >= 12.5 && x <= 22.5)&& (y >= 6 && y <= 8.5 ) )|| 
				((x >= 12.5 && x <= 17.5) && (y >= 8.5 && y <= 13.5)) ||
				((x >= 20 && x <= 22.5) && (y >= 8.5 && y <= 13.5)) ) {
			
			System.out.println("Inside");
			
		} else {
			System.out.println("Outside");
		}

	}

}
