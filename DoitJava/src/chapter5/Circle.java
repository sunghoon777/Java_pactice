package chapter5;

import java.util.Objects;
import chapter4.Shape;

public class Circle extends Shape {
	
	private int x;
	private int y;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle ("+x+","+y+")"+"반지름"+radius;
	}

	@Override
	public int hashCode() {
		return x+y;
	}

	@Override
	public boolean equals(Object obj) {
		Circle other = (Circle) obj;
		return x == other.x && y == other.y;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
