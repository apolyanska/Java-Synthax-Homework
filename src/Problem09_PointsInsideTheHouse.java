import java.util.Scanner;


public class Problem09_PointsInsideTheHouse {

	public static void main(String[] args) {

		double x;	//coordinates of given point M
		double y;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter coordinates: ");
		x = input.nextDouble();
		y = input.nextDouble();
		

		if (  ( (21 - y) <= x && x <= (y + 14) ) && (3.5 <= y && y <= 8.5)// inside the triangle
				
				// the value of x coordinates are calculated with the formula for equation of line
				
				|| ( (12.5 <= x && x <= 17.7 )&&(8.5 <= y && y <= 13.5)) // inside the square
				|| ((20<= x && x <= 22.5) && (8.5 <= y && y<= 13.5)) ){		// inside the rectangle
			
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");

		}
		
	}

}
