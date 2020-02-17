package geometricShapes;
import java.lang.Math;
import java.util.Scanner;

/**
 * @author HamzaBoubacar --> Haz
 *
 */

public class RtTriangle extends Shape {
//	Data fields
	private double base = 0;
	private double height = 0;
	
//	Constructors
	public RtTriangle() {
		super("RtTriangle");
	}
	
//	Construct a right triangle of the specified size
	public RtTriangle(double base, double height) {
		super("RtTriangle");
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double computeArea() {
		return base * height;
	}
	
	@Override
	public double computePerimeter() {
		return base * height + Math.pow((Math.pow(base, 2) + Math.pow(height, 2)), 0.5);
	}
	
	@Override
	public void readShapeData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base of the right triangle: ");
		base = scan.nextDouble();
		System.out.println("Enter the height of the right triangle: ");
		height = scan.nextDouble();
//		scan.close();
	}
	
	@Override
	public String toString() {
		return super.toString() + "; the base is " + base + ", the height is " + height;
	}
	
//	Comparing two shapes
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(obj instanceof RtTriangle) {
			RtTriangle test = (RtTriangle) obj;
			if(test.base == this.base && test.height == this.height) {
				return true;
			}
		}
		return false;
	}


}
