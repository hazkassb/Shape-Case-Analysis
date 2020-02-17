package geometricShapes;
import java.util.Scanner;

/**
 * @author HamzaBoubacar --> Haz
 *
 */

public class Circle extends Shape {
	
//	data fields
	private double raduis = 0;	//the radius of the circle

//	Constructors
	public Circle() {
		super("Circle");
	}
	
//	construct a circle of the specified size
	public Circle(double raduis) {
		super("Circle");
		this.raduis = raduis;
	}

	
//	Methods
	
/* get the radius, return the radius
 * 
 */
	public double getRaduis() {
		return raduis;
	}
	
	@Override
	public void readShapeData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the raduis of the circle: ");
		raduis = scan.nextDouble();
//		scan.close();
	}
	
	@Override
	public double computePerimeter() {
		return 2 * Math.PI * raduis;
	}
	
	@Override
	public double computeArea() {
		return Math.PI * Math.pow(raduis, 2);
	}

	//create a string representation of the Circle
	@Override
	public String toString() {
		return super.toString() + "; raduis is " + raduis;
	}
	
	
	@Override
//	Comparing two shapes
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(obj instanceof Circle) {
			Circle test = (Circle) obj;
			if(test.raduis == this.raduis) {
				return true;
			}
		}
		return false;
	}

}
