package application;

import entities.enums.Color;
import interFace.Shape;

public abstract class AbstractShape implements Shape {

	private Color color;

	public AbstractShape(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
	

	
	

}
