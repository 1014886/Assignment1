package com.yash.spring_core_assignment_.Q14;

public class ShapeFactory {
	
	public static Circle getCircle() {
		return new Circle();
	}

	public static Rectangle getRectangle() {
		return new Rectangle();
	}
	
	public static Square getSquare(){

		return new Square();
	}
}



