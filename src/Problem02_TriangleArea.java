import java.util.Scanner;
public class Problem02_TriangleArea {

	public static void main(String[] args) {

		//double[] coordsA = new double[2];
				double Ax;
				 double Ay;
				 double Bx;
				 double By;
				 double Cx;
				 double Cy;
				 double area;
				Scanner input = new Scanner (System.in);
				
				System.out.print("Enter A-coordinates: ");
				//String line1 = input.nextLine();
				//coordsA = line1.split(' ')
				Ax = input.nextDouble();
				Ay = input.nextDouble();
				
				System.out.print("Enter B-coordinates: ");	
				Bx = input.nextDouble();
				By = input.nextDouble();
				
				System.out.print("Enter C-coordinates: ");		
				Cx = input.nextDouble();
				Cy = input.nextDouble();
				
				
				
				if ((By-Ay)/(Bx - Ax) == (Cy - Ay)/(Cx - Ax)) {
					System.out.println("0");
				}
				else {
					area = Math.abs((Ax*(By - Cy) + Bx*(Cy - Ay)+ Cx *(Ay - By)) / 2);
				System.out.printf("area= %.2f", area);
				}
				
			}
	}


