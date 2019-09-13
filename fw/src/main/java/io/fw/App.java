package io.fw;

/**
 * Hello world!
 *
 */
public class App 
{
    
	private static final String colors[]= {"red","green","black","white","blue"};
	
	public static void main( String[] args )
    {
      for(int i =0; i<20; i++) {
    	Circle circle = ShapeFactory.getCircle(getRandomcolor(),getRandomX(),getRandomX();  
       circle.setX(120);
       circle.setRadius(50);
       circle.setY(100);
       circle.drow();
      
      }
      
      
      
      
      
      
    }
	private static String getRandomcolor() {
		
		
		
		return colors((int)(Math.random()*colors.length));
		
	}
	private static int getRandomX() {
		return (int) (Math.random()*100);
	}
    
	private static int getRandomY() {
		return (int) (Math.random()*100);
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // this i for testings 
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}
