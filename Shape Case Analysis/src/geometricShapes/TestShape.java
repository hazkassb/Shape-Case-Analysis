package geometricShapes;
import java.util.Scanner;
/**
 * @author HamzaBoubacar --> Haz
 *
 */

public class TestShape {

	public static void main(String[] args) {
		Shape myShape;
		double perimeter;
		double area;
		do {
			myShape = getShape(); 	//Ask for figure type
			if (myShape == null) {
//				System.exit(0);
				break;
			}
			myShape.readShapeData();
			perimeter = myShape.computePerimeter();
			area = myShape.computeArea();
			displayResult(myShape, area, perimeter);

		} while(1 !=0);
		System.out.println("Successfully exited");
		
//		Comparing two identical square
		Square  a = new Square(12);
		Square  b = new Square(12);
		System.out.println("\n"+ "Comparing two identical square: " + a.equals(b) + "\n");
		
//		Comparing two identical Rectangle
		Rectangle  r1 = new Rectangle(3.5, 5);
		Rectangle  r2 = new Rectangle(3.5, 5);
		System.out.println("\n"+ "Comparing two identical Rectangle: " + r1.equals(r2) + "\n");
		
//		Comparing two different Circles
		Circle  c1 = new Circle(3.5);
		Circle  c2 = new Circle(3.5);
		System.out.println("\n"+ "Comparing two different Circles: " + c1.equals(c2) + "\n");
		
//		Comparing two different Right Triangles
		RtTriangle  t1 = new RtTriangle(5.5, 2.4);
		RtTriangle  t2 = new RtTriangle(3, 5.9);
		System.out.println("\n"+"Comparing two different Right Triangles: " + t1.equals(t2) + "\n");
	
	}
	
	public static Shape getShape() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter C for circle: ");
		System.out.println("Enter R for Rectangle: ");
		System.out.println("Enter T for right  triangle: ");
		System.out.println("Enter S for a Square: ");
		
		System.out.println("Enter Q to quit: ");
		
		String figType = scan.nextLine();
		
//		scan.close();
		if (figType.equalsIgnoreCase("c")) {
			return new Circle();
		}
		else if (figType.equalsIgnoreCase("r")) {
			return new Rectangle();
		}
		else if (figType.equalsIgnoreCase("t")) {
			return new RtTriangle();
		}
		else if (figType.equalsIgnoreCase("s")) {
			return new Square();
		}
		
		else
			return null;
	}
	
	//Display result
	private static void displayResult(Shape myShape, double area, double perim) {
		System.out.println(myShape);
		System.out.printf("The area is %.2f\nThe perimeter is %.2f\n\n", area, perim);
	}
}
