package ab;

import app.io.AbstractFactory;
import color.io.*;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		    
		if(shape==null) {
			   return null;
		   }
		   if(shape.equalsIgnoreCase("Circle")) {
			  return new Circle();
		   }
		   else if(shape.equalsIgnoreCase("Squre"))
		   {
			   return new Squre();
		   }
		   else if(shape.equalsIgnoreCase("rectangle"))
		   {
			   return new Rectangle();
		   }
		
		return null;
		
		
		
		
		
		
	}
	
	
}
