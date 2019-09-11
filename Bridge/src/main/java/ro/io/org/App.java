package ro.io.org;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     
    	Shape Redcircle =  new Circle(10,200,300, new RedCircle());
    	Shape Greencircle =  new Circle(10,200,300, new GreenCircle());
    	Redcircle.draw();
    	Greencircle.draw();
    
    }

	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
