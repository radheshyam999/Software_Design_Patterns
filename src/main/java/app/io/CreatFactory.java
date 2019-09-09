package app.io;

import ab.ShapeFactory;
import color.io.ColorFactory;

public class CreatFactory  {

	public static AbstractFactory getFactory(String s) {
		
     if(s.equalsIgnoreCase("color")) {
		return	new ColorFactory(); 
	 	}
		else if(s.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		}
		
		
		return null;
		
	}
	
}
