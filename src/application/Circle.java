package application;

import entities.enums.Color;

public class Circle extends AbstractShape {
	
	
	
	public double radius;
	

	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}






	@Override
	public Double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	
	
	
	
	
	
	
	

}
