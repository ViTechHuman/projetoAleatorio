package application;

import entities.enums.Color;

public class Rectangle extends AbstractShape{
	

	private double width;
	private double height;
	
	
	
	public Rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	
	@Override
	public Double area() {
		return width * height;
	}
	
	

}
