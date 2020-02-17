/**
 * 
 */
package geometricShapes;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author HamzaBoubacar
 *
 */
public class Square extends Shape {
	//Data field
	private double side = 0;
	
//	Constructors
	public Square() {
		super("Square");
	}
	
//	Construct a square of the specified side length
	public Square(double side) {
		super("Square");
		this.side = side;
	}
	
	@Override
	public double computeArea() {
		return side * side;
	}
	
	@Override
	public double computePerimeter() {
		return 4 * side;
	}
	
	@Override
	public void readShapeData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the side of the square: ");
		side = scan.nextDouble();
	}
	
	@Override
	public String toString() {
		return super.toString() + ": the side is " + side;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Square)) {
			return false;
		}
		Square other = (Square) obj;
		return Double.doubleToLongBits(side) == Double.doubleToLongBits(other.side);
	}
	
	

}
