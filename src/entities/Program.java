package entities;

import java.util.Locale;
import java.util.Scanner;

import application.AbstractShape;
import application.Circle;
import application.Rectangle;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner (System.in);
		
		AbstractShape s1 = new Rectangle(Color.BLACK, 3, 4);
		AbstractShape s2 = new Circle(Color.WHITE, 2);
		
		System.out.println("Circle color: " + s1.getColor());
		
		
		System.out.println("Rectangle area: " + String.format("%.3f", s1.area()) );
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()) );
		
		System.out.println("Olá mundo");
		
		
		
		teclado.close();

	}

}
