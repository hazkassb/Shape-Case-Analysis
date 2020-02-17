package geometricShapes;

import java.util.Scanner;

import org.w3c.dom.css.Rect;

/**
 * @author HamzaBoubacar --> Haz
 */

public class Rectangle extends Shape {
	private double width = 0;
	private double height = 0;
	
	//Constructor
	public Rectangle() {
		super("Rectangle");
	}
	
	//Construct a rectangle of specified dimensions
	public Rectangle(double width, double height) {
		super("Rectangle");
		this.width = width;
		this.height = height;
	}
	
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}


	//Read the attributes of the rectangle
	
	@Override
	public void readShapeData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the width of the rectangle: ");
		width = scan.nextDouble();
		System.out.println("Enter the height of the rectangle: ");
		height = scan.nextDouble();
//		scan.close();
	}

	//create a string representation of the rectangle
	@Override
	public String toString() {
		return super.toString() + "; width is " + width + ", height is " + height;
	}


	@Override
	public double computePerimeter() {
		return 2*(height + width);
	}
	
	@Override
	public double computeArea() {
		return height * width;
	}
	
	@Override
//	Comparing two shapes
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(obj instanceof Rectangle) {
			Rectangle test = (Rectangle) obj;
			if(test.width == this.width && test.height == this.height) {
				return true;
			}
		}
		return false;
	}
		

}
