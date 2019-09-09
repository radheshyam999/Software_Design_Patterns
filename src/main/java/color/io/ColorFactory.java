package color.io;

import ab.Shape;
import app.io.AbstractFactory;

public class ColorFactory extends AbstractFactory {
	/**
	 * this is abstract factory  design pattern 
	 * 
	 * 
	 * **/

	@Override
	public Color getColor(String color) {
		
		if(color==null) {
			   return null;
		   }
		   if(color.equalsIgnoreCase("Red")) {
			  return new Red();
		   }
		   else if(color.equalsIgnoreCase("Green"))
		   {
			   return new Green();
		   }
		   else if(color.equalsIgnoreCase("Blue"))
		   {
			   return new Blue();
		   }		
		
		
		return null;

		
		
		
	}

	@Override
	public Shape getShape(String shape) {
		
		
		
		
		return null;
	}
	
	
	
}
