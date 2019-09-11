package haver.io;
public class FactorPattern  {
    public static Shape getShape(String shape) {
    	if(shape==null) {
    		return null;
    	}
    	if(shape.equalsIgnoreCase("circle")) {
    	        	   
    	       return new Circle();
    	
    	
    	}
    	else if(shape.equalsIgnoreCase("conic")) {
    		
    		return new Conic();
    	}
    	
       else if(shape.equalsIgnoreCase("Squre")) {
    		
    		return new Squre();
    	}
    	
    	
		return null;
    	
    }
	
	public static void main(String arg[]) {
	   
    	
    	
      }

	
	
	
	
	
	
}
