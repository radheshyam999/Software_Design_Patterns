package io.fw;

import java.util.HashMap;

public class ShapeFactory {

	private static final HashMap circleMap = new HashMap();
	public static Circle getCircle(String color, int x, int y){
		Circle  circle = (Circle) circleMap.get(color);
		  if(circle==null) {
		      circleMap.put(color, circle);
		    System.out.println("I am drowing circle "+circle);
		  
		  }
		
		
		
		return circle;
		
		
		
	}
}
