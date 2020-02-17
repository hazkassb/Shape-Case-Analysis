package geometricShapes;

import java.util.Objects;

/**
 * @author HamzaBoubacar --> Haz
 *
 */

abstract class Shape {
	private String shapeName = "";
	
	public Shape(String shapeName) {
		this.shapeName = shapeName;
	}
	
	public String toString() {
		return "Shape is a " + shapeName;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Shape)) {
			return false;
		}
		Shape other = (Shape) obj;
		return Objects.equals(shapeName, other.shapeName);
	}

//	 @return the shapeName
	public String getShapeName() {
		return shapeName;
	}
	
	
	//abstract methods
	public abstract double computeArea();
	public abstract double computePerimeter();
	public abstract void readShapeData();
		
}
